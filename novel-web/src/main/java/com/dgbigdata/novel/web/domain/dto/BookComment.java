package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 小说评论
 *
 * @TableName book_comment
 */
@Data
@TableName("book_comment")
public class BookComment extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 评论小说ID
     */
    private String bookId;
    /**
     * 评论用户ID
     */
    private String userId;
    /**
     * 评价内容
     */
    private String commentContent;
    /**
     * 回复数量
     */
    private Integer replyCount;
    /**
     * 审核状态;0.待审核 1.审核通过 2.审核不通过
     */
    private Integer auditStatus;

}
