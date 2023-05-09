package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 首页小说推荐
 *
 * @TableName home_book
 */
@Data
@TableName("home_book")
public class HomeBook extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 推荐类型;0.轮播图 1.顶部栏 2.本周强推 3.热门推荐 4.精品推荐
     */
    private Integer type;
    /**
     * 推荐排序
     */
    private Integer sort;
    /**
     * 推荐小说ID
     */
    private String bookId;

}
