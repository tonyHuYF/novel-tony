package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.NewsCategory;
import com.dgbigdata.novel.web.mapper.NewsCategoryMapper;
import com.dgbigdata.novel.web.service.NewsCategoryService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【news_category(新闻类别)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class NewsCategoryServiceImpl extends MyBatisPlusService<NewsCategoryMapper, NewsCategory>
    implements NewsCategoryService {

}




