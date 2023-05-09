package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.UserInfo;
import com.dgbigdata.novel.web.mapper.UserInfoMapper;
import com.dgbigdata.novel.web.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【user_info(用户信息)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class UserInfoServiceImpl extends MyBatisPlusService<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




