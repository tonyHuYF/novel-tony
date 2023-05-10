package com.dgbigdata.novel.web.service;

import com.dgbigdata.novel.web.domain.dto.resp.ImgVerifyCodeRespDto;

import java.io.IOException;

/**
 * 资源（图片/视频/文档）相关服务类
 *
 */
public interface ResourceService {

    /**
     * 获取图片验证码
     *
     */
    ImgVerifyCodeRespDto getImgVerifyCode() throws IOException;
}
