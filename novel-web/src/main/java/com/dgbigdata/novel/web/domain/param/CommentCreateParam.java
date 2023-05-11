package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.CommentCreateDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 评论发表参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreateParam {

    /**
     * 评论用户ID
     */
    @ApiModelProperty(value = "评论用户ID")
    private String userId;

    /**
     * 评论小说ID
     */
    @NotBlank
    @ApiModelProperty(value = "评论小说ID", required = true)
    private String bookId;

    /**
     * 评论内容
     */
    @NotBlank
    @ApiModelProperty(value = "评论内容", required = true)
    private String commentContent;



    public CommentCreateDto getCommentCreateDto() {
        return BeanUtil.copyProperties(this, CommentCreateDto.class);
    }

}
