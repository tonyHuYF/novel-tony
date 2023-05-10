package com.dgbigdata.novel.web.manager.cache;

import com.dgbigdata.novel.web.constant.CacheConsts;
import com.dgbigdata.novel.web.domain.dto.UserInfo;
import com.dgbigdata.novel.web.domain.dto.resp.UserInfoCacheRespDto;
import com.dgbigdata.novel.web.mapper.UserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 用户信息缓存管理类
 */
@Component
@RequiredArgsConstructor
public class UserInfoCacheManager {
    private final UserInfoMapper userInfoMapper;

    /**
     * 查询用户信息，并放入缓存中
     */
    @Cacheable(cacheManager = CacheConsts.REDIS_CACHE_MANAGER,
            value = CacheConsts.USER_INFO_CACHE_NAME)
    public UserInfoCacheRespDto getUser(String userId) {
        UserInfo userInfo = userInfoMapper.selectById(userId);
        if (userInfo == null) {
            return null;
        }
        return UserInfoCacheRespDto.builder()
                .id(userInfo.getId())
                .status(userInfo.getStatus()).build();
    }
}
