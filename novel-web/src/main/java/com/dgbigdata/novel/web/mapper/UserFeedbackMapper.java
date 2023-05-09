package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.UserFeedback;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【user_feedback(用户反馈)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:17
* @Entity com.tony.novel.web.domain.UserFeedback
*/
@Mapper
public interface UserFeedbackMapper extends BaseMapper<UserFeedback> {

}




