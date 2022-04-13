package com.study.helloworld.test;

import com.study.helloworld.entity.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/getHello")
    public String getHello(Model model){
        model.addAttribute("hello","hahahahha");
        return "helloworld";
    }
}
