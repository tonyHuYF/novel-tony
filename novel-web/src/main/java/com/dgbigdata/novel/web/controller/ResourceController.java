package com.dgbigdata.novel.web.controller;

import com.dgbigdata.common.api.domain.ResultBean;
import com.dgbigdata.novel.web.constant.ApiRouterConsts;
import com.dgbigdata.novel.web.domain.dto.resp.ImgVerifyCodeRespDto;
import com.dgbigdata.novel.web.domain.vo.ImgVerifyCodeVo;
import com.dgbigdata.novel.web.service.ResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@Api(tags = "前台门户-资源(图片/视频/文档)模块")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_RESOURCE_URL_PREFIX)
@RequiredArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    /**
     * 获取图片验证码接口
     */
    @ApiOperation(value = "获取图片验证码")
    @PostMapping("/imgVerifyCode")
    public ResultBean<ImgVerifyCodeVo> getImgVerifyCode() throws IOException {
        ImgVerifyCodeRespDto dto = resourceService.getImgVerifyCode();
        return ResultBean.ok(new ImgVerifyCodeVo(dto.getSessionId(), dto.getImg()));
    }

}
