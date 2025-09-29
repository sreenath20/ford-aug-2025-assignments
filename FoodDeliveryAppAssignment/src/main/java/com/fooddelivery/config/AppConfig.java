package com.fooddelivery.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//to make it as meta data
@ComponentScan(basePackages = "com.fooddelivery")
public class AppConfig {
}
