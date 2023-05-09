package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.AuthorIncome;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【author_income(稿费收入统计)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:16
* @Entity com.tony.novel.web.domain.AuthorIncome
*/
@Mapper
public interface AuthorIncomeMapper extends BaseMapper<AuthorIncome> {

}




