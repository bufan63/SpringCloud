package com.open.common.security.annotation;

import  com.open.common.security.component.OpenSecurityBeanDefinitionRegistrar;
import com.open.common.security.component.OpenResourceServerAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
 * 资源服务注解
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({OpenResourceServerAutoConfiguration.class, OpenSecurityBeanDefinitionRegistrar.class})
public @interface EnableOpenResourceServer {

}
