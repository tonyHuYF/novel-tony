package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.UserConsumeLog;
import com.dgbigdata.novel.web.mapper.UserConsumeLogMapper;
import com.dgbigdata.novel.web.service.UserConsumeLogService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【user_consume_log(用户消费记录)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class UserConsumeLogServiceImpl extends MyBatisPlusService<UserConsumeLogMapper, UserConsumeLog>
    implements UserConsumeLogService{

}




