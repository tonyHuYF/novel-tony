package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.AuthorCode;
import com.dgbigdata.novel.web.mapper.AuthorCodeMapper;
import com.dgbigdata.novel.web.service.AuthorCodeService;
import org.springframework.stereotype.Service;

/**
 * @author TonyHu
 * @description 针对表【author_code(作家邀请码)】的数据库操作Service实现
 * @createDate 2023-05-09 11:24:16
 */
@Service
public class AuthorCodeServiceImpl extends MyBatisPlusService<AuthorCodeMapper, AuthorCode>
        implements AuthorCodeService {

}




