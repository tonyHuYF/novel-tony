package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.CommentUpdateDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 评论修改参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentUpdateParam {

    /**
     * id
     */
    @NotBlank
    @ApiModelProperty(value = "id", required = true)
    private String id;

    /**
     * 评论用户ID
     */
    @ApiModelProperty(value = "评论用户ID")
    private String userId;

    /**
     * 评论内容
     */
    @NotBlank
    @ApiModelProperty(value = "评论内容", required = true)
    private String commentContent;



    public CommentUpdateDto getCommentUpdateDto() {
        return BeanUtil.copyProperties(this, CommentUpdateDto.class);
    }

}
