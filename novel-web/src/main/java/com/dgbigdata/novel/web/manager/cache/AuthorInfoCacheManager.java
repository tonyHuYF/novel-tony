package com.dgbigdata.novel.web.manager.cache;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dgbigdata.novel.web.constant.CacheConsts;
import com.dgbigdata.novel.web.domain.dto.AuthorInfo;
import com.dgbigdata.novel.web.domain.dto.resp.AuthorInfoCacheRespDto;
import com.dgbigdata.novel.web.mapper.AuthorInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 作家信息 缓存管理类
 */
@Component
@RequiredArgsConstructor
public class AuthorInfoCacheManager {

    private final AuthorInfoMapper authorInfoMapper;

    /**
     * 查询作家细腻些，并放入缓存中
     */
    @Cacheable(cacheManager = CacheConsts.REDIS_CACHE_MANAGER,
            value = CacheConsts.AUTHOR_INFO_CACHE_NAME, unless = "#result==null")
    public AuthorInfoCacheRespDto getAuthor(String userId) {
        LambdaQueryWrapper<AuthorInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(AuthorInfo::getUserId, userId);
        AuthorInfo authorInfo = authorInfoMapper.selectOne(wrapper);
        if (authorInfo == null) {
            return null;
        }

        return AuthorInfoCacheRespDto.builder()
                .id(authorInfo.getId())
                .penName(authorInfo.getPenName())
                .status(authorInfo.getStatus())
                .build();
    }

    @CacheEvict(cacheManager = CacheConsts.REDIS_CACHE_MANAGER,
            value = CacheConsts.AUTHOR_INFO_CACHE_NAME)
    public void evictAuthorCache() {
        //调用此方法清除作家信息的缓存
    }

}
