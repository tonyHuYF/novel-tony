package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 小说评论回复
 *
 * @TableName book_comment_reply
 */
@Data
@TableName("book_comment_reply")
public class BookCommentReply extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 评论ID
     */
    private String commentId;
    /**
     * 回复用户ID
     */
    private String userId;
    /**
     * 回复内容
     */
    private String replyContent;
    /**
     * 审核状态;0.待审核 1.审核通过 2.审核不通过
     */
    private Integer auditStatus;

}
