package com.yyx.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: testController
 * @Description: 测试控制器层
 * @author: yuyuexiang
 * @date: 2021/4/3 17:47
 */
@RestController
public class testController {

    @Value("${test.name:111}")
    private String perName;

    @PostMapping("/demo")
    public String demo() {

            return "Hellor World!"+perName;
        }
    @PostMapping("/postTest")
    public String demoTest(String name) {
            return "Hellor World!"+name;
        }
}


