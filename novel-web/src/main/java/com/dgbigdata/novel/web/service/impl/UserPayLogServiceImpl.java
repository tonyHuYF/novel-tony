package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.UserPayLog;
import com.dgbigdata.novel.web.mapper.UserPayLogMapper;
import com.dgbigdata.novel.web.service.UserPayLogService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【user_pay_log(用户充值记录)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class UserPayLogServiceImpl extends MyBatisPlusService<UserPayLogMapper, UserPayLog>
    implements UserPayLogService{

}




