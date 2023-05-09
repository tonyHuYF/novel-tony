package com.dgbigdata.novel.web.mapper;

import com.dgbigdata.novel.web.domain.dto.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author TonyHu
* @description 针对表【sys_menu(系统菜单)】的数据库操作Mapper
* @createDate 2023-05-09 11:24:16
* @Entity com.tony.novel.web.domain.SysMenu
*/
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

}




