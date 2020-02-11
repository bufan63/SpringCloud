package com.open.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 刘念
 * @date 2020年1月30日14:48:03
 * 网关应用
 */
@SpringCloudApplication
public class OpenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenGatewayApplication.class, args);
    }
}
