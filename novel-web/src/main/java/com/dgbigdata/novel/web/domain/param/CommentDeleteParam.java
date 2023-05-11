package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.CommentDeleteDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 评论删除参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDeleteParam {

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


    public CommentDeleteDto getCommentDeleteDto() {
        return BeanUtil.copyProperties(this, CommentDeleteDto.class);
    }

}
