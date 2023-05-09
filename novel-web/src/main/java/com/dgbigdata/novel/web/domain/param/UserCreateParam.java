package com.dgbigdata.novel.web.domain.param;

import cn.hutool.core.bean.BeanUtil;
import com.dgbigdata.novel.web.domain.dto.req.UserCreateDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 用户新增参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateParam {

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

    /**
     * 验证码
     */
    @NotBlank
    @ApiModelProperty(value = "验证码", required = true)
    private String velCode;

    /**
     * 请求会话标识，用来标识图形验证码属于哪个会话
     */
    @NotBlank
    @ApiModelProperty(value = "请求会话标识，用来标识图形验证码属于哪个会话", required = true)
    private String sessionId;

    public UserCreateDto getUserCreateDto() {
        return BeanUtil.copyProperties(this, UserCreateDto.class);
    }

}
