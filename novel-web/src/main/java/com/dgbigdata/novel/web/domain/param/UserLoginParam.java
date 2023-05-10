package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.UserLoginDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 用户登录参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginParam {

    /**
     * 手机号
     */
    @NotBlank
    @ApiModelProperty(value = "手机号", required = true)
    private String username;

    /**
     * 密码
     */
    @NotBlank
    @ApiModelProperty(value = "密码", required = true)
    private String password;


    public UserLoginDto getUserLoginDto() {
        return BeanUtil.copyProperties(this, UserLoginDto.class);
    }

}
