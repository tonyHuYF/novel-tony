package com.dgbigdata.novel.web.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickName;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像")
    private String userPhoto;

    /**
     * 用户性别
     */
    @ApiModelProperty(value = "用户性别")
    private Integer userSex;

}
