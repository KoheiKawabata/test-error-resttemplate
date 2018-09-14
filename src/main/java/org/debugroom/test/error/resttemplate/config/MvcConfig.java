package org.debugroom.test.error.resttemplate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("org.debugroom.test.error.resttemplate.app")
@Configuration
public class MvcConfig implements WebMvcConfigurer {
}
