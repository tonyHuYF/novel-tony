package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 小说章节
 *
 * @TableName book_chapter
 */
@Data
@TableName("book_chapter")
public class BookChapter extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 小说ID
     */
    private String bookId;
    /**
     * 章节号
     */
    private Integer chapterNum;
    /**
     * 章节名
     */
    private String chapterName;
    /**
     * 章节字数
     */
    private Integer wordCount;
    /**
     * 是否收费;0.免费 1.收费
     */
    private Integer isVip;

}
