package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.SysRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【sys_role_menu(角色与菜单对应关系)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:16
* @Entity com.tony.novel.web.domain.SysRoleMenu
*/
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}




