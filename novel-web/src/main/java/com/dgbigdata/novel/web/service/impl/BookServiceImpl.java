package com.dgbigdata.novel.web.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dgbigdata.common.api.domain.CommonException;
import com.dgbigdata.novel.web.annotation.Key;
import com.dgbigdata.novel.web.annotation.Lock;
import com.dgbigdata.novel.web.domain.BusinessError;
import com.dgbigdata.novel.web.domain.dto.BookComment;
import com.dgbigdata.novel.web.domain.dto.req.CommentCreateDto;
import com.dgbigdata.novel.web.domain.dto.req.CommentDeleteDto;
import com.dgbigdata.novel.web.domain.dto.req.CommentUpdateDto;
import com.dgbigdata.novel.web.service.BookCommentService;
import com.dgbigdata.novel.web.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookCommentService bookCommentService;

    @Lock(prefix = "userComment")
    @Override
    public void createComment(
            @Key(expr = "#{userId + '::' + bookId}") CommentCreateDto dto) {
        LambdaQueryWrapper<BookComment> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(BookComment::getUserId, dto.getUserId());
        wrapper.eq(BookComment::getBookId, dto.getBookId());
        long count = bookCommentService.count(wrapper);
        if (count > 0) {
            throw new CommonException(BusinessError.USER_COMMENTED);
        }

        BookComment bookComment = BeanUtil.copyProperties(dto, BookComment.class);
        bookComment.setId(IdUtil.fastSimpleUUID());
        bookCommentService.save(bookComment);
    }

    @Override
    public void updateComment(CommentUpdateDto dto) {
        BookComment bookComment = BeanUtil.copyProperties(dto, BookComment.class);
        bookCommentService.updateById(bookComment);
    }

    @Override
    public void deleteComment(CommentDeleteDto dto) {
        LambdaQueryWrapper<BookComment> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(BookComment::getId, dto.getId());
        wrapper.eq(BookComment::getUserId, dto.getUserId());
        bookCommentService.remove(wrapper);
    }
}
