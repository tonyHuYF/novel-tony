package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysRoleMenu;
import com.dgbigdata.novel.web.mapper.SysRoleMenuMapper;
import com.dgbigdata.novel.web.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_role_menu(角色与菜单对应关系)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class SysRoleMenuServiceImpl extends MyBatisPlusService<SysRoleMenuMapper, SysRoleMenu>
    implements SysRoleMenuService{

}




