package com.tlw.springboot.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.IOException;

/**
 * Created by tlw@winning.com.cn on 2017/5/12.
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

}