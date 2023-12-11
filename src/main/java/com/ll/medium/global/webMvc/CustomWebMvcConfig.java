package com.ll.medium.global.webMvc;

import com.ll.medium.global.app.AppConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfig implements WebMvcConfigurer {
    public CustomWebMvcConfig() {
    }

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**").allowedOrigins(new String[]{"https://cdpn.io", "http://localhost:5173"}).allowedMethods(new String[]{"*"}).allowedHeaders(new String[]{"*"}).allowCredentials(true);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(new String[]{"/gen/**"}).addResourceLocations(new String[]{"file:///" + AppConfig.getGenFileDirPath() + "/"});
    }
}