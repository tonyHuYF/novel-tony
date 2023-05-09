package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.HomeBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【home_book(首页小说推荐)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:16
* @Entity com.tony.novel.web.domain.HomeBook
*/
@Mapper
public interface HomeBookMapper extends BaseMapper<HomeBook> {

}




