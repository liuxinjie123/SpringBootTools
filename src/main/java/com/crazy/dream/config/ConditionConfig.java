package com.crazy.dream.config;

import com.crazy.dream.service.SystemService;
import com.crazy.dream.service.impl.LinuxConditionImpl;
import com.crazy.dream.service.impl.LinuxServiceImpl;
import com.crazy.dream.service.impl.WindowsConditionImpl;
import com.crazy.dream.service.impl.WindowsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsConditionImpl.class)
    public SystemService windowsListService() {
        return new WindowsServiceImpl();
    }

    @Bean
    @Conditional(LinuxConditionImpl.class)
    public SystemService linuxListService() {
        return new LinuxServiceImpl();
    }

}
