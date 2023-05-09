package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.AuthorInfo;
import com.dgbigdata.novel.web.mapper.AuthorInfoMapper;
import com.dgbigdata.novel.web.service.AuthorInfoService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【author_info(作者信息)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class AuthorInfoServiceImpl extends MyBatisPlusService<AuthorInfoMapper, AuthorInfo>
    implements AuthorInfoService {

}




