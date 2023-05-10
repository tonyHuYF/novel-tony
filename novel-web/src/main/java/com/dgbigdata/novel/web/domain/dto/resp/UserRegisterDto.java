package com.dgbigdata.novel.web.domain.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDto {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户token
     */
    private String token;
}
