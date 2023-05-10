package com.dgbigdata.novel.web.auth;

import lombok.experimental.UtilityClass;

/**
 * 用户持有类
 */
@UtilityClass
public class UserHolder {
    /**
     * 当前线程用户ID
     */
    private static final ThreadLocal<String> userIdTL = new ThreadLocal<>();

    /**
     * 当前线程作家ID
     */
    private static final ThreadLocal<String> authorIdTL = new ThreadLocal<>();

    public void setUserId(String userId) {
        userIdTL.set(userId);
    }

    public String getUserId() {
        return userIdTL.get();
    }

    public void setAuthorId(String authorId) {
        authorIdTL.set(authorId);
    }

    public String getAuthorId() {
        return authorIdTL.get();
    }

    public void clear() {
        userIdTL.remove();
        authorIdTL.remove();
    }

}
