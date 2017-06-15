package org.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: html-server
 * @Package: org.rent.controller
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/6/13 10:27
 * @version: V1.0
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "wuyujia");
        return "hello";
    }

    @GetMapping("/index")
    public String index(Model model) {
        System.out.println("我走的controller 哟");
        model.addAttribute("username", "wuyujia");
        return "index";
    }
}
