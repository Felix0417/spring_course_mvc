package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

//    @RequestMapping(value = "/")
    @GetMapping("/")
    public String showFirstView(){
        return "first-view";
    }
}
