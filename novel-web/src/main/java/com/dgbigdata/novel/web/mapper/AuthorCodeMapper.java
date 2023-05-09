package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.AuthorCode;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【author_code(作家邀请码)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:16
* @Entity com.tony.novel.web.domain.AuthorCode
*/
@Mapper
public interface AuthorCodeMapper extends BaseMapper<AuthorCode> {

}




