package com.dgbigdata.novel.web.domain.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoCacheRespDto implements Serializable {

    private static final long serialVersionUID = 1798224249525849247L;

    /**
     * 用户id
     */
    private String id;

    /**
     * 状态;0.正常 1.删除
     */
    private Integer status;

}
