package org.example.primary_and_qualifirer.configuration;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.example.primary_and_qualifirer")
public class AppConfig {
}
