package com.dgbigdata.novel.web.service.impl;

import cn.hutool.core.util.IdUtil;
import com.dgbigdata.novel.web.domain.dto.resp.ImgVerifyCodeRespDto;
import com.dgbigdata.novel.web.manager.VerifyCodeManager;
import com.dgbigdata.novel.web.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final VerifyCodeManager verifyCodeManager;

    @Override
    public ImgVerifyCodeRespDto getImgVerifyCode() throws IOException {
        String sessionId = IdUtil.fastSimpleUUID();
        String img = verifyCodeManager.genImgVerifyCode(sessionId);
        return new ImgVerifyCodeRespDto(sessionId, img);
    }
}
