package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 小说类别
 *
 * @TableName book_category
 */
@Data
@TableName("book_category")
public class BookCategory extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 作品方向;0.男频 1.女频
     */
    private Integer workDirection;
    /**
     * 类别名
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;

}
