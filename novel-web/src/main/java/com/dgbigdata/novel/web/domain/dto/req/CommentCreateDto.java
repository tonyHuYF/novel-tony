package com.dgbigdata.novel.web.domain.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreateDto {

    /**
     * 评论用户ID
     */
    private String userId;

    /**
     * 评论小说ID
     */
    private String bookId;

    /**
     * 评论内容
     */
    private String commentContent;


}
