package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 小说内容
 *
 * @TableName book_content
 */
@Data
@TableName("book_content")
public class BookContent extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 章节ID
     */
    private String chapterId;
    /**
     * 小说章节内容
     */
    private String content;

}
