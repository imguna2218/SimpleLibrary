package com.example.SimpleLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SimpleLibraryApplication extends SpringBootServletInitializer {

    // CRITICAL: This method hooks the app into the Tomcat server
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleLibraryApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleLibraryApplication.class, args);
    }
}