package com.open.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 刘念
 * @date 2020年1月30日14:48:03
 * <p>
 * 网关应用
 */
@SpringCloudApplication
@ConfigurationPropertiesScan
public class OpenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenGatewayApplication.class, args);
    }
}
