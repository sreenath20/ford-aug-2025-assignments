package org.fooddelivery.config;




import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "org.fooddelivery.notification" )
@ComponentScan(basePackages = "org.fooddelivery.order")
@ComponentScan(basePackages = "org.fooddelivery.payment")

public class AppConfig {

}
