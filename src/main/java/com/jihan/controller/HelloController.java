package com.jihan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jihan
 * @Date: 2020/6/28
 * @Description: com.jihan.controller
 * @version: 1.0
 */
@RestController
public class HelloController {

    @RequestMapping(value = "info")
    public String getInfo(){
        return "Hello World";
    }
}
