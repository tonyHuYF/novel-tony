package com.dgbigdata.novel.web.manager.redis;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.dgbigdata.common.core.cache.RedisUtils;
import com.dgbigdata.novel.web.constant.CacheConsts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 验证码 管理类
 */
@Component
@RequiredArgsConstructor
public class VerifyCodeManager {
    private final RedisUtils redisUtils;

    /**
     * 生成图形验证码，并放入 Redis 中
     */
    public String genImgVerifyCode(String sessionId) throws IOException {
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 5);
        String verifyCode = captcha.getCode();
        redisUtils.set(CacheConsts.IMG_VERIFY_CODE_CACHE_KEY + sessionId, verifyCode, 5 * 60);
//        captcha.write("d:/shear.png");
        return captcha.getImageBase64();
    }

    /**
     * 校验图形验证码
     */
    public boolean imgVerifyCodeOk(String sessionId, String verifyCode) {
        if (redisUtils.get(CacheConsts.IMG_VERIFY_CODE_CACHE_KEY + sessionId) == null) {
            return false;
        }
        return redisUtils.get(CacheConsts.IMG_VERIFY_CODE_CACHE_KEY + sessionId).equals(verifyCode);
    }

    /**
     * 从 Redis 中删除验证码
     */
    public void removeVerifyCode(String sessionId) {
        redisUtils.del(CacheConsts.IMG_VERIFY_CODE_CACHE_KEY + sessionId);
    }

}
