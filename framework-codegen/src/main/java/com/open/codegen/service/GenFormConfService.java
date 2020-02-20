package com.open.codegen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.codegen.entity.GenFormConf;

/**
 * 表单管理
 */
public interface GenFormConfService extends IService<GenFormConf> {

	/**
	 * 获取表单信息
	 *
	 * @param dsId      数据源ID
	 * @param tableName 表名称
	 * @return
	 */
	String getForm(Integer dsId, String tableName);

}
