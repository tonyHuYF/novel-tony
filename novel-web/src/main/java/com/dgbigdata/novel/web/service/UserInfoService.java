package com.dgbigdata.novel.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dgbigdata.novel.web.domain.dto.UserInfo;
import com.dgbigdata.novel.web.domain.dto.req.UserCreateDto;
import com.dgbigdata.novel.web.domain.dto.req.UserInfoDto;
import com.dgbigdata.novel.web.domain.dto.req.UserLoginDto;
import com.dgbigdata.novel.web.domain.dto.req.UserUpdateDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserInfoRespDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserLoginRespDto;
import com.dgbigdata.novel.web.domain.dto.resp.UserRegisterDto;

/**
* @author TonyHu
* @description 针对表【user_info(用户信息)】的数据库操作Service
* @createDate 2023-05-09 11:24:17
*/
public interface UserInfoService extends IService<UserInfo> {

    UserRegisterDto register(UserCreateDto dto);

    UserLoginRespDto login(UserLoginDto dto);

    UserInfoRespDto queryOne(UserInfoDto dto);

    void update(UserUpdateDto dto);

}
