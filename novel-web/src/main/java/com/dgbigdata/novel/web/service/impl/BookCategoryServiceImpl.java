package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.BookCategory;
import com.dgbigdata.novel.web.mapper.BookCategoryMapper;
import com.dgbigdata.novel.web.service.BookCategoryService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【book_category(小说类别)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class BookCategoryServiceImpl extends MyBatisPlusService<BookCategoryMapper, BookCategory>
    implements BookCategoryService {

}




