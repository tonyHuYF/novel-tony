package com.dgbigdata.novel.web.domain.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {
    /**
     * 手机号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 验证码
     */
    private String velCode;

    /**
     * 请求会话标识，用来标识图形验证码属于哪个会话
     */
    private String sessionId;

}
