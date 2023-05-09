package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户反馈
 *
 * @TableName user_feedback
 */
@Data
@TableName("user_feedback")
public class UserFeedback extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 反馈用户ID
     */
    private String userId;
    /**
     * 反馈内容
     */
    private String content;

}
