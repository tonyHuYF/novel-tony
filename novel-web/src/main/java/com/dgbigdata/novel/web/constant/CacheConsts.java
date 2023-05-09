package com.dgbigdata.novel.web.constant;

/**
 * 缓存相关常量
 */
public class CacheConsts {

    /**
     * 本项目 Redis 缓存前缀
     */
    public static final String REDIS_CACHE_PREFIX = "Cache::Novel::";

    /**
     * Caffeine 缓存管理器
     */
    public static final String CAFFEINE_CACHE_MANAGER = "caffeineCacheManager";

    /**
     * Redis 缓存管理器
     */
    public static final String REDIS_CACHE_MANAGER = "redisCacheManager";

    /**
     * 首页小说推荐缓存
     */
    public static final String HOME_BOOK_CACHE_NAME = "homeBookCache";

    /**
     * 最新新闻缓存
     */
    public static final String LATEST_NEWS_CACHE_NAME = "latestNewsCache";

    /**
     * 小说点击榜缓存
     */
    public static final String BOOK_VISIT_RANK_CACHE_NAME = "bookVisitRankCache";

    /**
     * 小说新书榜缓存
     */
    public static final String BOOK_NEWEST_RANK_CACHE_NAME = "bookNewestRankCache";

    /**
     * 小说更新榜缓存
     */
    public static final String BOOK_UPDATE_RANK_CACHE_NAME = "bookUpdateRankCache";

    /**
     * 首页友情链接缓存
     */
    public static final String HOME_FRIEND_LINK_CACHE_NAME = "homeFriendLinkCache";

    /**
     * 小说分类列表缓存
     */
    public static final String BOOK_CATEGORY_LIST_CACHE_NAME = "bookCategoryListCache";

    /**
     * 小说信息缓存
     */
    public static final String BOOK_INFO_CACHE_NAME = "bookInfoCache";

    /**
     * 小说章节缓存
     */
    public static final String BOOK_CHAPTER_CACHE_NAME = "bookChapterCache";

    /**
     * 小说内容缓存
     */
    public static final String BOOK_CONTENT_CACHE_NAME = "bookContentCache";

    /**
     * 最近更新小说ID列表缓存
     */
    public static final String LAST_UPDATE_BOOK_ID_LIST_CACHE_NAME = "lastUpdateBookIdListCache";

    /**
     * 图片验证码缓存 KEY
     */
    public static final String IMG_VERIFY_CODE_CACHE_KEY = REDIS_CACHE_PREFIX + "imgVerifyCodeCache::";

    /**
     * 用户信息缓存
     */
    public static final String USER_INFO_CACHE_NAME = "userInfoCache";

    /**
     * 作家信息缓存
     */
    public static final String AUTHOR_INFO_CACHE_NAME = "authorInfoCache";


































}
