package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.PayAlipay;
import com.dgbigdata.novel.web.mapper.PayAlipayMapper;
import com.dgbigdata.novel.web.service.PayAlipayService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【pay_alipay(支付宝支付)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class PayAlipayServiceImpl extends MyBatisPlusService<PayAlipayMapper, PayAlipay>
    implements PayAlipayService{

}




