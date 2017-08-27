package com.crazy.dream.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@ConfigurationProperties(prefix = "my")
public class MyPropertySettings implements Serializable {
    private String name;
    private String phone;
    private String email;
}
