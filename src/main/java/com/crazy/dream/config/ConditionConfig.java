package com.crazy.dream.config;

import com.crazy.dream.service.ListService;
import com.crazy.dream.service.impl.LinuxConditionImpl;
import com.crazy.dream.service.impl.LinuxListServiceImpl;
import com.crazy.dream.service.impl.WindowsConditionImpl;
import com.crazy.dream.service.impl.WindowsListServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsConditionImpl.class)
    public ListService windowsListService() {
        return new WindowsListServiceImpl();
    }

    @Bean
    @Conditional(LinuxConditionImpl.class)
    public ListService linuxListService() {
        return new LinuxListServiceImpl();
    }

}
