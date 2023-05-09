package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.NewsInfo;
import com.dgbigdata.novel.web.mapper.NewsInfoMapper;
import com.dgbigdata.novel.web.service.NewsInfoService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【news_info(新闻信息)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class NewsInfoServiceImpl extends MyBatisPlusService<NewsInfoMapper, NewsInfo>
    implements NewsInfoService{

}




