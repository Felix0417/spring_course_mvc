package com.felix.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping(value = "/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee){
        employee.setName("Mr. " + employee.getName());
        employee.setSurname(employee.getSurname() + "!!!");
        employee.setSalary(employee.getSalary() * 10);
        return "show-emp-details-view";
    }

}
