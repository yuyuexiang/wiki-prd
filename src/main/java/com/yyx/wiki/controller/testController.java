package com.yyx.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: testController
 * @Description: 测试控制器层
 * @author: yuyuexiang
 * @date: 2021/4/3 17:47
 */
@RestController //前后端分离，接口只返回字符串给前端
public class testController {

//    @GetMapping("/demo") //只支持get请求，如果不是get请求访问此接口，报405错
    @PostMapping("/demo")
    public String demo() {

            return "Hellor World!";
        }
    @PostMapping("/postTest")
    public String demoTest(String name) {
            return "Hellor World!"+name;
        }
}


