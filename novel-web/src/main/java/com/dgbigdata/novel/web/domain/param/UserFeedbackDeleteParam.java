package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.UserFeedbackDeleteDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 用户反馈删除参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFeedbackDeleteParam {

    /**
     * id
     */
    @NotBlank
    @ApiModelProperty(value = "id", required = true)
    private String id;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private String userId;


    public UserFeedbackDeleteDto getUserFeedbackDeleteDto() {
        return BeanUtil.copyProperties(this, UserFeedbackDeleteDto.class);
    }

}
