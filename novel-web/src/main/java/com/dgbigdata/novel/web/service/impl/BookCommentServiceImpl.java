package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.BookComment;
import com.dgbigdata.novel.web.mapper.BookCommentMapper;
import com.dgbigdata.novel.web.service.BookCommentService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【book_comment(小说评论)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class BookCommentServiceImpl extends MyBatisPlusService<BookCommentMapper, BookComment>
    implements BookCommentService {

}




