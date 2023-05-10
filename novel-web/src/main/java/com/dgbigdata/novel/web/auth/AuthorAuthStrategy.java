package com.dgbigdata.novel.web.auth;

import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.novel.web.constant.ApiRouterConsts;
import com.dgbigdata.novel.web.domain.BusinessError;
import com.dgbigdata.novel.web.domain.dto.resp.AuthorInfoCacheRespDto;
import com.dgbigdata.novel.web.manager.cache.AuthorInfoCacheManager;
import com.dgbigdata.novel.web.manager.cache.UserInfoCacheManager;
import com.dgbigdata.novel.web.util.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 作家后台管理系统 认证授权策略
 */
@Component
@RequiredArgsConstructor
public class AuthorAuthStrategy implements AuthStrategy {

    private final JwtUtils jwtUtils;

    private UserInfoCacheManager userInfoCacheManager;

    private AuthorInfoCacheManager authorInfoCacheManager;

    /**
     * 不需要进行作家认证授权的URI
     */
    private static final List<String> EXCLUDE_URI = Arrays.asList(
            ApiRouterConsts.API_AUTHOR_URL_PREFIX + "/register",
            ApiRouterConsts.API_AUTHOR_URL_PREFIX + "/status"
    );


    @Override
    public void auth(String token, String requestUri) throws CommonException {
        //统一认证授权
        String userId = authSSO(jwtUtils, userInfoCacheManager, token);
        if (EXCLUDE_URI.contains(requestUri)) {
            //放行
            return;
        }
        //作家权限认证
        AuthorInfoCacheRespDto author = authorInfoCacheManager.getAuthor(userId);
        if (author == null) {
            //作家用户不存在，无法访问作家专区
            throw new CommonException(BusinessError.USER_UN_AUTH);
        }

        //设置作家ID到当前线程
        UserHolder.setAuthorId(author.getId());
    }
}
