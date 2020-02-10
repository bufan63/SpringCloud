package com.open.upms.biz;


import com.open.common.security.annotation.EnableOpenFeignClients;
import com.open.common.security.annotation.EnableOpenResourceServer;
import com.open.common.swagger.annotation.EnableOpenSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 用户统一管理系统
 */
@EnableOpenSwagger2
@EnableOpenResourceServer
@EnableOpenFeignClients
@SpringCloudApplication
public class OpenAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenAdminApplication.class, args);
	}

}
