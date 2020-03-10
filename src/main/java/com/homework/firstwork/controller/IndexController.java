package com.homework.firstwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.text.DateFormat;
import java.util.Date;

/*
@Note：测试controller

@User：NineSun
@Time:2020/3/3   21:18
*/
@Controller
public class IndexController {
    @GetMapping(value = {"","/index"})
    public String hello(Model model) throws Exception{
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "index";
    }
}


