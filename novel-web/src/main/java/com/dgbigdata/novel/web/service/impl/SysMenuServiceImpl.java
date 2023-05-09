package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysMenu;
import com.dgbigdata.novel.web.mapper.SysMenuMapper;
import com.dgbigdata.novel.web.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_menu(系统菜单)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class SysMenuServiceImpl extends MyBatisPlusService<SysMenuMapper, SysMenu>
    implements SysMenuService {

}




