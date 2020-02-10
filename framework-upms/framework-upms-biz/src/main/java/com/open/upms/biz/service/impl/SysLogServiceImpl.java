package com.open.upms.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.open.upms.api.entity.SysLog;
import com.open.upms.biz.mapper.SysLogMapper;
import com.open.upms.biz.service.SysLogService;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}
