package com.crazy.dream.config;

import com.crazy.dream.config.interceptors.UserVisitInterceptorAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.crazy.dream")
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("file:./files/");
        registry.addResourceHandler("/script/**").addResourceLocations("file:./web/app/script/");
        registry.addResourceHandler("/images/**").addResourceLocations("file:./web/app/images/");
        registry.addResourceHandler("/styles/**").addResourceLocations("file:./web/app/styles/");
    }

    @Autowired
    private UserVisitInterceptorAdapter userVisitInterceptorAdapter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userVisitInterceptorAdapter);
    }

}