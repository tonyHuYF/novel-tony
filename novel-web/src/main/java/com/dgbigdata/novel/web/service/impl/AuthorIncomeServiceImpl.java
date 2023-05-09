package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.AuthorIncome;
import com.dgbigdata.novel.web.mapper.AuthorIncomeMapper;
import com.dgbigdata.novel.web.service.AuthorIncomeService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【author_income(稿费收入统计)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class AuthorIncomeServiceImpl extends MyBatisPlusService<AuthorIncomeMapper, AuthorIncome>
    implements AuthorIncomeService {

}




