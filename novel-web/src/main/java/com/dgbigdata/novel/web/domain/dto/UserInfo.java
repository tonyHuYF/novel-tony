package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @TableName user_info
 */
@Data
@TableName("user_info")
public class UserInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 登录名
     */
    private String username;
    /**
     * 登录密码-加密
     */
    private String password;
    /**
     * 加密盐值
     */
    private String salt;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 用户头像
     */
    private String userPhoto;
    /**
     * 用户性别;0.男 1.女
     */
    private Integer userSex;
    /**
     * 账户余额
     */
    private Long accountBalance;

}
