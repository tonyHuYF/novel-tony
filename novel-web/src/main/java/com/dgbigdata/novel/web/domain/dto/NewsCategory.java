package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 新闻类别
 *
 * @TableName news_category
 */
@Data
@TableName("news_category")
public class NewsCategory extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 类别名
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;

}
