package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.AuthorIncomeDetail;
import com.dgbigdata.novel.web.mapper.AuthorIncomeDetailMapper;
import com.dgbigdata.novel.web.service.AuthorIncomeDetailService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【author_income_detail(稿费收入明细统计)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class AuthorIncomeDetailServiceImpl extends MyBatisPlusService<AuthorIncomeDetailMapper, AuthorIncomeDetail>
    implements AuthorIncomeDetailService {

}




