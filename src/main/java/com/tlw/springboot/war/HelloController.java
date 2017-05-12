package com.tlw.springboot.war;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tlw@winning.com.cn on 2017/5/12.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    String hello(){
        return "Hello...";
    }
}
