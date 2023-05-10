package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.UserUpdateDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 用户修改参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateParam {

    /**
     * 用户ID
     */
    @NotBlank
    @ApiModelProperty(value = "用户ID", required = true)
    private String userId;

    /**
     * 昵称
     */
    @NotBlank
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 头像地址
     */
    @NotBlank
    @ApiModelProperty(value = "头像地址")
    private String userPhoto;

    /**
     * 性别
     */
    @NotNull
    @ApiModelProperty(value = "性别")
    private Integer userSex;


    public UserUpdateDto getUserUpdateDto() {
        return BeanUtil.copyProperties(this, UserUpdateDto.class);
    }

}
