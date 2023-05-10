package com.dgbigdata.novel.web.controller;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.common.api.domain.ResultBean;
import com.dgbigdata.novel.web.constant.ApiRouterConsts;
import com.dgbigdata.novel.web.domain.dto.resp.UserLoginRespDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserRegisterDto;
import com.dgbigdata.novel.web.domain.param.UserCreateParam;
import com.dgbigdata.novel.web.domain.param.UserLoginParam;
import com.dgbigdata.novel.web.domain.vo.UserLoginVo;
import com.dgbigdata.novel.web.domain.vo.UserRegisterVo;
import com.dgbigdata.novel.web.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "前台门户会员相关接口")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_USER_URL_PREFIX)
@RequiredArgsConstructor
public class UserController {

    private final UserInfoService userInfoService;

    /**
     * 用户注册接口
     */
    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ResultBean<UserRegisterVo> register(@Validated @RequestBody UserCreateParam param) {
        UserRegisterDto dto = userInfoService.register(param.getUserCreateDto());
        return ResultBean.ok(new UserRegisterVo(dto.getUserId(),dto.getToken()));
    }

    /**
     * 用户登录接口
     */
    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ResultBean<UserLoginVo> login (@Validated@RequestBody UserLoginParam param){
        UserLoginRespDto dto = userInfoService.login(param.getUserLoginDto());
        return ResultBean.ok(BeanUtil.copyProperties(dto,UserLoginVo.class));
    }


}
