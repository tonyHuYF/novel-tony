package com.dgbigdata.novel.web.service.impl;

import com.dgbigdata.common.core.service.MyBatisPlusService;
import com.dgbigdata.novel.web.domain.dto.SysLog;
import com.dgbigdata.novel.web.mapper.SysLogMapper;
import com.dgbigdata.novel.web.service.SysLogService;
import org.springframework.stereotype.Service;

/**
* @author TonyHu
* @description 针对表【sys_log(系统日志)】的数据库操作Service实现
* @createDate 2023-05-09 11:24:16
*/
@Service
public class SysLogServiceImpl extends MyBatisPlusService<SysLogMapper, SysLog>
    implements SysLogService {

}




