package com.dgbigdata.novel.web.domain;

import com.dgbigdata.common.api.domain.Error;

/**
 * 业务错误类型
 */
public class BusinessError {
    public static final Error USER_VERIFY_CODE_ERROR = new Error(60001, "用户验证码错误");
    public static final Error USER_NAME_EXIST = new Error(60002, "用户名已存在");
    public static final Error USER_ACCOUNT_NOT_EXIST = new Error(60003, "用户账号不存在");
    public static final Error USER_PASSWORD_ERROR = new Error(60004, "用户密码错误");






}
