package com.dgbigdata.novel.web.auth;

import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.novel.web.manager.cache.UserInfoCacheManager;
import com.dgbigdata.novel.web.util.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 前台门户认证授权策略
 */
@Component
@RequiredArgsConstructor
public class FrontAuthStrategy implements AuthStrategy {

    private final JwtUtils jwtUtils;

    private final UserInfoCacheManager userInfoCacheManager;

    @Override
    public void auth(String token, String requestUri) throws CommonException {
        //统一账户认证
        authSSO(jwtUtils, userInfoCacheManager, token);
    }
}
