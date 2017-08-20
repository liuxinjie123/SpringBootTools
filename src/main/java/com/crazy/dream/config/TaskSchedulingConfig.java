package com.crazy.dream.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.crazy.dream.schedule")
@EnableScheduling
public class TaskSchedulingConfig {
}
