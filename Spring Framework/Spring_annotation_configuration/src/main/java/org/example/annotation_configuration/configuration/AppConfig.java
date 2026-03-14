package org.example.annotation_configuration.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:di.property")
@Configuration
@ComponentScan(basePackages = "org.example.annotation_configuration")
public class AppConfig {

}