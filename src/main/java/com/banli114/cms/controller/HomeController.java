package com.banli114.cms.controller;

import cn.hutool.core.lang.Console;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JRong
 * @version V1.0
 * @Package com.banli114.cms.controller
 * @date 2019/12/19 14:06
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public  String Home(){
        Console.log("home");
        return "index";
    }
}
