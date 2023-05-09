package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.UserConsumeLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【user_consume_log(用户消费记录)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:17
* @Entity com.tony.novel.web.domain.UserConsumeLog
*/
@Mapper
public interface UserConsumeLogMapper extends BaseMapper<UserConsumeLog> {

}




