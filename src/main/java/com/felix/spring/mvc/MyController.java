package com.felix.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(){
        return "show-emp-details-view";
    }

}
