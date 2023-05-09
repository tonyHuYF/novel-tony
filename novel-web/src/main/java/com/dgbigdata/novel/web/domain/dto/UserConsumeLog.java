package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户消费记录
 *
 * @TableName user_consume_log
 */
@Data
@TableName("user_consume_log")
public class UserConsumeLog extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 消费用户ID
     */
    private String userId;
    /**
     * 消费使用的金额;单位：屋币
     */
    private Integer amount;
    /**
     * 消费商品类型;0.小说VIP章节
     */
    private Integer productType;
    /**
     * 消费的商品ID;例如：章节ID
     */
    private String productId;
    /**
     * 消费的商品名;例如：章节名
     */
    private String productName;
    /**
     * 消费的商品值;例如：1
     */
    private Integer productValue;

}
