package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.BookInfo;
import com.dgbigdata.novel.web.mapper.BookInfoMapper;
import com.dgbigdata.novel.web.service.BookInfoService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【book_info(小说信息)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class BookInfoServiceImpl extends MyBatisPlusService<BookInfoMapper, BookInfo>
    implements BookInfoService {

}




