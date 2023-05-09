package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 作者信息
 *
 * @TableName author_info
 */
@Data
@TableName("author_info")
public class AuthorInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 邀请码
     */
    private String inviteCode;
    /**
     * 笔名
     */
    private String penName;
    /**
     * 手机号码
     */
    private String telPhone;
    /**
     * QQ或微信账号
     */
    private String chatAccount;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 作品方向;0.男频 1.女频
     */
    private Integer workDirection;

}
