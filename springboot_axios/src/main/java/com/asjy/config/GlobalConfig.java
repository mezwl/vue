package com.asjy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: GlobalConfig
 * Package: com.asjy.config
 * Description:
 *
 * @Author 梓维李
 * @Create 2023/2/26 16:40
 * @Version 2.0
 */
@Configuration
public class GlobalConfig implements WebMvcConfigurer {

    @Autowired
   WebConfig webConfig;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webConfig).addPathPatterns("/**");
    }

}
