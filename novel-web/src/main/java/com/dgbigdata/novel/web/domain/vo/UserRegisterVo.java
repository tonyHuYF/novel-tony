package com.dgbigdata.novel.web.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterVo implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private String userId;

    /**
     * 用户token
     */
    @ApiModelProperty(value = "用户token")
    private String token;
}
