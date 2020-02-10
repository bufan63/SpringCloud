package com.open.monitor;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 */
@EnableAdminServer
@SpringCloudApplication
public class OpenMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenMonitorApplication.class, args);
	}
}
