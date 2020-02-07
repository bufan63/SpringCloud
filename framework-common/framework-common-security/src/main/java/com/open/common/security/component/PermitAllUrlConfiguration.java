package com.open.common.security.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.ArrayList;
import java.util.List;

/**
 * 放行接口配置
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = "ignore")
public class PermitAllUrlConfiguration {
	/**
	 * 放行url,支持 ant 表达式
	 */
	private List<String> urls = new ArrayList<>();
}
