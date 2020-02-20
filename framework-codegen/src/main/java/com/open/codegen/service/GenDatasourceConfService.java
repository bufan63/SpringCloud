package com.open.codegen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.codegen.entity.GenDatasourceConf;

/**
 * 数据源表
 */
public interface GenDatasourceConfService extends IService<GenDatasourceConf> {
	/**
	 * 保存数据源并且加密
	 *
	 * @param genDatasourceConf
	 * @return
	 */
	Boolean saveDsByEnc(GenDatasourceConf genDatasourceConf);

	/**
	 * 更新数据源
	 *
	 * @param genDatasourceConf
	 * @return
	 */
	Boolean updateDsByEnc(GenDatasourceConf genDatasourceConf);
}
