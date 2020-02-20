package com.open.codegen;

import com.open.common.datasource.annotation.EnableDynamicDataSource;
import com.open.common.security.annotation.EnableOpenFeignClients;
import com.open.common.security.annotation.EnableOpenResourceServer;
import com.open.common.swagger.annotation.EnableOpenSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成模块
 */
@EnableDynamicDataSource
@EnableOpenSwagger2
@SpringCloudApplication
@EnableOpenFeignClients
@EnableOpenResourceServer
public class OpenCodeGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCodeGenApplication.class, args);
	}
}
