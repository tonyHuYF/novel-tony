package com.dgbigdata.novel.web.domain.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像地址
     */
    private String userPhoto;

    /**
     * 性别
     */
    private Integer userSex;

}
