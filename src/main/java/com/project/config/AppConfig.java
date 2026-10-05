package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project")
public class AppConfig {

    @Bean
    public ApplicationInfo applicationInfo() {
        return new ApplicationInfo(
                "Employee Management",
                "1.0"
        );
    }
}