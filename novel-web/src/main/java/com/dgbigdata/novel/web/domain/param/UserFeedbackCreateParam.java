package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.UserFeedbackCreateDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 用户反馈提交参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFeedbackCreateParam {

    /**
     * 反馈用户ID
     */
    @ApiModelProperty(value = "反馈用户ID")
    private String userId;

    /**
     * 反馈内容
     */
    @NotBlank
    @ApiModelProperty(value = "反馈内容", required = true)
    private String content;


    public UserFeedbackCreateDto getUserFeedbackCreateDto() {
        return BeanUtil.copyProperties(this, UserFeedbackCreateDto.class);
    }

}
