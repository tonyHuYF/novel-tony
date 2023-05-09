package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysRole;
import com.dgbigdata.novel.web.mapper.SysRoleMapper;
import com.dgbigdata.novel.web.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_role(角色)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class SysRoleServiceImpl extends MyBatisPlusService<SysRoleMapper, SysRole>
    implements SysRoleService{

}




