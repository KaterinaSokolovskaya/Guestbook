package com.guestbook.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@Import({ThymeleafConfig.class})
@ComponentScan(basePackages = {"com.guestbook.web.controller"})
@EnableWebMvc
public class WebConfig {
}
