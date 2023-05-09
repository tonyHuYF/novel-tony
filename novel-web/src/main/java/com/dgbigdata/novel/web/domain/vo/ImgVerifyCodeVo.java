package com.dgbigdata.novel.web.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImgVerifyCodeVo implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 当前会话ID，用于标识改图形验证码属于哪个会话
     */
    @ApiModelProperty(value = "当前会话ID，用于标识改图形验证码属于哪个会话")
    private String sessionId;

    /**
     * Base64 编码的验证码图片
     */
    @ApiModelProperty(value = "Base64 编码的验证码图片")
    private String img;

}
