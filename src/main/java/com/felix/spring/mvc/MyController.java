package com.felix.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/info")
    public String showInfo(){
        return "info-view";
    }
}
