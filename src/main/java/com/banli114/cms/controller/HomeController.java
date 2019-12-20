package com.banli114.cms.controller;

import cn.hutool.core.lang.Console;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author JRong
 * @version V1.0
 * @Package com.banli114.cms.controller
 * @date 2019/12/19 14:06
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public  String Home(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException{
        Console.log("home");
        //获取浏览器信息
        Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
        //获取浏览器版本号
        Version version = browser.getVersion(request.getHeader("User-Agent"));
        String info = browser.getName() + "/" + version.getVersion();
        Console.log(info);
        return "index";
    }


}
