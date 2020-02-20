package com.open.codegen.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.open.codegen.entity.GenDatasourceConf;
import com.open.codegen.mapper.GenDatasourceConfMapper;
import com.open.codegen.service.GenDatasourceConfService;
import com.open.common.datasource.config.DynamicDataSourceConfig;
import lombok.AllArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Service;

/**
 * 数据源表
 */
@Service
@AllArgsConstructor
public class GenDatasourceConfServiceImpl extends ServiceImpl<GenDatasourceConfMapper, GenDatasourceConf> implements GenDatasourceConfService {
	private final DynamicDataSourceConfig dynamicDataSourceConfig;
	private final StringEncryptor stringEncryptor;

	/**
	 * 保存数据源并且加密
	 *
	 * @param genDatasourceConf
	 * @return
	 */
	@Override
	public Boolean saveDsByEnc(GenDatasourceConf genDatasourceConf) {
		genDatasourceConf.setPassword(stringEncryptor.encrypt(genDatasourceConf.getPassword()));
		this.baseMapper.insert(genDatasourceConf);
		return dynamicDataSourceConfig.reload();
	}

	/**
	 * 更新数据源
	 *
	 * @param genDatasourceConf
	 * @return
	 */
	@Override
	public Boolean updateDsByEnc(GenDatasourceConf genDatasourceConf) {
		if (StrUtil.isNotBlank(genDatasourceConf.getPassword())) {
			genDatasourceConf.setPassword(stringEncryptor.encrypt(genDatasourceConf.getPassword()));
		}
		this.baseMapper.updateById(genDatasourceConf);
		return dynamicDataSourceConfig.reload();
	}
}
