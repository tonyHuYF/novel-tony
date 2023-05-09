package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 稿费收入统计
 *
 * @TableName author_income
 */
@Data
@TableName("author_income")
public class AuthorIncome extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 作家ID
     */
    private String authorId;
    /**
     * 小说ID
     */
    private String bookId;
    /**
     * 收入月份
     */
    private LocalDateTime incomeMonth;
    /**
     * 税前收入;单位：分
     */
    private Integer preTaxIncome;
    /**
     * 税后收入;单位：分
     */
    private Integer afterTaxIncome;
    /**
     * 支付状态;0.待支付 1.已支付
     */
    private Integer payStatus;
    /**
     * 稿费确认状态;0.待确认 1.已确认
     */
    private Integer confirmStatus;
    /**
     * 详情
     */
    private String detail;

}
