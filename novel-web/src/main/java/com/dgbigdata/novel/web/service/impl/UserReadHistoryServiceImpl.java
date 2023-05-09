package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.UserReadHistory;
import com.dgbigdata.novel.web.mapper.UserReadHistoryMapper;
import com.dgbigdata.novel.web.service.UserReadHistoryService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【user_read_history(用户阅读历史)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class UserReadHistoryServiceImpl extends MyBatisPlusService<UserReadHistoryMapper, UserReadHistory>
    implements UserReadHistoryService{

}




