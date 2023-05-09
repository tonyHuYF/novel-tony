package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 新闻内容
 *
 * @TableName news_content
 */
@Data
@TableName("news_content")
public class NewsContent extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 新闻ID
     */
    private String newsId;
    /**
     * 新闻内容
     */
    private String content;

}
