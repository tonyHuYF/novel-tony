package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysUser;
import com.dgbigdata.novel.web.mapper.SysUserMapper;
import com.dgbigdata.novel.web.service.SysUserService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_user(系统用户)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class SysUserServiceImpl extends MyBatisPlusService<SysUserMapper, SysUser>
    implements SysUserService{

}




