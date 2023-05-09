package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 作家邀请码
 *
 * @TableName author_code
 */
@Data
@TableName("author_code")
public class AuthorCode extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 邀请码
     */
    private String inviteCode;
    /**
     * 有效时间
     */
    private LocalDateTime validityTime;
    /**
     * 是否使用过;0.未使用 1.使用过
     */
    private Integer isUsed;

}
