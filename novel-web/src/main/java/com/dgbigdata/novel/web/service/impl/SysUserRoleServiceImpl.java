package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysUserRole;
import com.dgbigdata.novel.web.mapper.SysUserRoleMapper;
import com.dgbigdata.novel.web.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_user_role(用户与角色对应关系)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:17
*/
@Service
public class SysUserRoleServiceImpl extends MyBatisPlusService<SysUserRoleMapper, SysUserRole>
    implements SysUserRoleService{

}




