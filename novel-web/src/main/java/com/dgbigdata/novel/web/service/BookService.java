package com.dgbigdata.novel.web.service;

import com.dgbigdata.novel.web.domain.dto.req.CommentCreateDto;
import com.dgbigdata.novel.web.domain.dto.req.CommentDeleteDto;
import com.dgbigdata.novel.web.domain.dto.req.CommentUpdateDto;

public interface BookService {

    void createComment(CommentCreateDto dto);

    void updateComment(CommentUpdateDto dto);

    void deleteComment(CommentDeleteDto dto);

}
