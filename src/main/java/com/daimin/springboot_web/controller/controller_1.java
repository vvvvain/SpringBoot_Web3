package com.daimin.springboot_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: controller_1
 * Package: com.daimin.springboot_web.controller
 * Description:直接从contoller中返回一个字符串
 *
 * @Author
 * @Create 2023/9/4
 * @Version 1.0
 */


@RestController

public class controller_1 {
    @RequestMapping("/")
    public String inde(){
        return "Hello,Daimin!2023/9/4";
    }
}
