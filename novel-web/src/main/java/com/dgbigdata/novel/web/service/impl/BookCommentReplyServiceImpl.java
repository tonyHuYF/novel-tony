package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.BookCommentReply;
import com.dgbigdata.novel.web.mapper.BookCommentReplyMapper;
import com.dgbigdata.novel.web.service.BookCommentReplyService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【book_comment_reply(小说评论回复)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class BookCommentReplyServiceImpl extends MyBatisPlusService<BookCommentReplyMapper, BookCommentReply>
    implements BookCommentReplyService {

}




