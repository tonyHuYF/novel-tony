package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 友情链接
 *
 * @TableName home_friend_link
 */
@Data
@TableName("home_friend_link")
public class HomeFriendLink extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 链接名
     */
    private String linkName;
    /**
     * 链接URL
     */
    private String linkUrl;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 是否开启;0.不开启 1.开启
     */
    private Integer isOpen;

}
