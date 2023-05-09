package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户充值记录
 *
 * @TableName user_pay_log
 */
@Data
@TableName("user_pay_log")
public class UserPayLog extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 充值用户ID
     */
    private String userId;
    /**
     * 充值方式;0-支付宝 1-微信
     */
    private Integer payChannel;
    /**
     * 商户订单号
     */
    private String outTradeNo;
    /**
     * 充值金额;单位：分
     */
    private Integer amount;
    /**
     * 充值商品类型;0-屋币 1-包年VIP
     */
    private Integer productType;
    /**
     * 充值商品ID
     */
    private String productId;
    /**
     * 充值商品名;示例值：屋币
     */
    private String productName;
    /**
     * 充值商品值;示例值：255
     */
    private Integer productValue;
    /**
     * 充值时间
     */
    private LocalDateTime payTime;
}
