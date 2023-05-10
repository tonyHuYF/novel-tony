package com.dgbigdata.novel.web.auth;

import cn.hutool.core.util.StrUtil;
import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.novel.web.constant.SystemConfigConsts;
import com.dgbigdata.novel.web.domain.BusinessError;
import com.dgbigdata.novel.web.domain.dto.resp.UserInfoCacheRespDto;
import com.dgbigdata.novel.web.manager.cache.UserInfoCacheManager;
import com.dgbigdata.novel.web.util.JwtUtils;

/**
 * 策略模式实现用户认证授权功能
 */
public interface AuthStrategy {

    /**
     * 用户认证授权
     *
     * @param token      登录 token
     * @param requestUri 请求得 URI
     * @throws CommonException
     */
    void auth(String token, String requestUri) throws CommonException;

    /**
     * @param jwtUtils             jwt 工具
     * @param userInfoCacheManager 用户缓存管理对象
     * @param token                token 登录 token
     * @return
     */
    default String authSSO(JwtUtils jwtUtils, UserInfoCacheManager userInfoCacheManager, String token) {
        if (StrUtil.isBlank(token)) {
            //token为空
            throw new CommonException(BusinessError.USER_LOGIN_EXPIRED);
        }
        String userId = jwtUtils.parseToken(token, SystemConfigConsts.NOVEL_FRONT_KEY);
        if (StrUtil.isBlank(userId)) {
            //token解析失败
            throw new CommonException(BusinessError.USER_LOGIN_EXPIRED);
        }
        UserInfoCacheRespDto user = userInfoCacheManager.getUser(userId);
        if (user == null) {
            //用户不存在
            throw new CommonException(BusinessError.USER_ACCOUNT_NOT_EXIST);
        }
        //设置 userId 到当前线程
        UserHolder.setUserId(userId);
        //返回
        return userId;

    }

}
