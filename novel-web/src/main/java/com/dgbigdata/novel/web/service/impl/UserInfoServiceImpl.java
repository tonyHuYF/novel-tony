package com.dgbigdata.novel.web.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.constant.SystemConfigConsts;
import com.dgbigdata.novel.web.domain.BusinessError;
import com.dgbigdata.novel.web.domain.dto.UserInfo;
import com.dgbigdata.novel.web.domain.dto.req.UserCreateDto;
import com.dgbigdata.novel.web.domain.vo.UserRegisterVo;
import com.dgbigdata.novel.web.manager.VerifyCodeManager;
import com.dgbigdata.novel.web.mapper.UserInfoMapper;
import com.dgbigdata.novel.web.service.UserInfoService;
import com.dgbigdata.novel.web.util.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author TonyHu
 * @description 针对表【user_info(用户信息)】的数据库操作Service实现
 * @createDate 2023-05-09 11:24:17
 */
@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl extends MyBatisPlusService<UserInfoMapper, UserInfo>
        implements UserInfoService {

    private final VerifyCodeManager verifyCodeManager;

    private final UserInfoMapper userInfoMapper;

    private final JwtUtils jwtUtils;


    @Override
    public UserRegisterVo register(UserCreateDto dto) {
        //校验图形验证码是否正确
        if (!verifyCodeManager.imgVerifyCodeOk(dto.getSessionId(), dto.getVelCode())) {
            // 图形验证码校验失败
            throw new CommonException(BusinessError.USER_VERIFY_CODE_ERROR);
        }

        //验证手机号是否已注册
        LambdaQueryWrapper<UserInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserInfo::getUsername, dto.getUsername());
        Long count = userInfoMapper.selectCount(wrapper);
        if (count > 0) {
            throw new CommonException(BusinessError.USER_NAME_EXIST);
        }

        //注册，保存用户信息
        UserInfo userInfo = new UserInfo();
        userInfo.setId(IdUtil.fastSimpleUUID());
        userInfo.setPassword(
                DigestUtils.md5DigestAsHex(dto.getPassword().getBytes(StandardCharsets.UTF_8)));
        userInfo.setUsername(dto.getUsername());
        userInfo.setNickName(dto.getUsername());
        userInfo.setSalt("0");
        save(userInfo);

        //删除验证码
        verifyCodeManager.removeVerifyCode(dto.getSessionId());

        //生成jwt
        String token = jwtUtils.generateToken(userInfo.getId(), SystemConfigConsts.NOVEL_FRONT_KEY);

        return new UserRegisterVo(userInfo.getId(), token);
    }
}




