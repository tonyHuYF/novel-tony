package com.dgbigdata.novel.web.domain.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFeedbackDeleteDto {

    /**
     * id
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

}
