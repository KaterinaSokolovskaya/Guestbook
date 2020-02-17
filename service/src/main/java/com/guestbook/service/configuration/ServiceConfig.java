package com.guestbook.service.configuration;

import com.guestbook.database.configuration.DatabaseConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.guestbook.service"})
@Import({DatabaseConfig.class})
public class ServiceConfig {
}
