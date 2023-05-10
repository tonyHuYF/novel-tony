package com.dgbigdata.novel.web.auth;

import com.dgbigdata.common.api.domain.CommonException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 平台后台管理系统 认证授权策略
 */
@Component
@RequiredArgsConstructor
public class AdminAuthStrategy implements AuthStrategy{

    @Override
    public void auth(String token, String requestUri) throws CommonException {
        //校验平台后台token

    }
}
