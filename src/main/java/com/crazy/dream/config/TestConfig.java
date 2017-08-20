package com.crazy.dream.config;

import com.crazy.dream.dto.test.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean(" test from development profile.");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean(" test from production profile.");
    }
}
