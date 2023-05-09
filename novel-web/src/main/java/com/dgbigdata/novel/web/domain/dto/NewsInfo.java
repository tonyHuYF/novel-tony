package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 新闻信息
 *
 * @TableName news_info
 */
@Data
@TableName("news_info")
public class NewsInfo extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 类别ID
     */
    private String categoryId;
    /**
     * 类别名
     */
    private String categoryName;
    /**
     * 新闻来源
     */
    private String sourceName;
    /**
     * 新闻标题
     */
    private String title;

}
