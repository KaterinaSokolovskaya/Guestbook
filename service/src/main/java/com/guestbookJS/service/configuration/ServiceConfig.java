package com.guestbookJS.service.configuration;

import com.guestbookJS.database.configuration.DatabaseConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.guestbookJS.service"})
@Import({DatabaseConfig.class})
public class ServiceConfig {
}
