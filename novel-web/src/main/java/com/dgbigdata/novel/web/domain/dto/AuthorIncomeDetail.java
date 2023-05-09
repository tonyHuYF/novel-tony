package com.dgbigdata.novel.web.domain.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dgbigdata.common.api.domain.BaseDomain;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 稿费收入明细统计
 *
 * @TableName author_income_detail
 */
@Data
@TableName("author_income")
public class AuthorIncomeDetail extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 作家ID
     */
    private String authorId;
    /**
     * 小说ID;0表示全部作品
     */
    private String bookId;
    /**
     * 收入日期
     */
    private LocalDateTime incomeDate;
    /**
     * 订阅总额
     */
    private Integer incomeAccount;
    /**
     * 订阅次数
     */
    private Integer incomeCount;
    /**
     * 订阅人数
     */
    private Integer incomeNumber;

}
