package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.UserFeedback;
import com.dgbigdata.novel.web.mapper.UserFeedbackMapper;
import com.dgbigdata.novel.web.service.UserFeedbackService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【user_feedback(用户反馈)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class UserFeedbackServiceImpl extends MyBatisPlusService<UserFeedbackMapper, UserFeedback>
    implements UserFeedbackService{

}




