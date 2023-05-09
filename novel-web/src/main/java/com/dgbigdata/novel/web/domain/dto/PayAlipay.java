package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 支付宝支付
 *
 * @TableName pay_alipay
 */
@Data
@TableName("pay_alipay")
public class PayAlipay extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 商户订单号
     */
    private String outTradeNo;
    /**
     * 支付宝交易号
     */
    private String tradeNo;
    /**
     * 买家支付宝账号ID
     */
    private String buyerId;
    /**
     * 交易状态;TRADE_SUCCESS-交易成功
     */
    private String tradeStatus;
    /**
     * 订单金额;单位：分
     */
    private Integer totalAmount;
    /**
     * 实收金额;单位：分
     */
    private Integer receiptAmount;
    /**
     * 开票金额
     */
    private Integer invoiceAmount;
    /**
     * 交易创建时间
     */
    private LocalDateTime gmtCreate;
    /**
     * 交易付款时间
     */
    private LocalDateTime gmtPayment;

}
