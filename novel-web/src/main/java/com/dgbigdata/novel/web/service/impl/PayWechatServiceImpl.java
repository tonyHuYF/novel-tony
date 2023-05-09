package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.PayWechat;
import com.dgbigdata.novel.web.mapper.PayWechatMapper;
import com.dgbigdata.novel.web.service.PayWechatService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【pay_wechat(微信支付)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class PayWechatServiceImpl extends MyBatisPlusService<PayWechatMapper, PayWechat>
    implements PayWechatService{

}




