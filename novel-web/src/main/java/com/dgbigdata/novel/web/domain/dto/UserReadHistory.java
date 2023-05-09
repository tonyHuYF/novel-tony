package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户阅读历史
 *
 * @TableName user_read_history
 */
@Data
@TableName("user_read_history")
public class UserReadHistory extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 小说ID
     */
    private String bookId;
    /**
     * 上一次阅读的章节内容表ID
     */
    private String preContentId;

}
