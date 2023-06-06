
package com.portfolio.vish;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc

@Configuration
public class WebConfig {

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**");

    }

   
}
