package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.BookContent;
import com.dgbigdata.novel.web.mapper.BookContentMapper;
import com.dgbigdata.novel.web.service.BookContentService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【book_content(小说内容)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class BookContentServiceImpl extends MyBatisPlusService<BookContentMapper, BookContent>
    implements BookContentService {

}




