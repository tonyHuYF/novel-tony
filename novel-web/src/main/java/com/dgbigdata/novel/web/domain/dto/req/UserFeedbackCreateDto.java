package com.dgbigdata.novel.web.domain.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFeedbackCreateDto {

    /**
     * 反馈用户ID
     */
    private String userId;

    /**
     * 反馈内容
     */
    private String content;


}
