package com.open.auth;


import com.pig4cloud.pig.common.security.annotation.EnablePigFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 认证授权中心
 */
@SpringCloudApplication
@EnableOpenFeignClients
public class OpenAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenAuthApplication.class, args);
	}
}
