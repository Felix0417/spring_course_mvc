package com.felix.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-details-view";
        } else {
            String[] tempNumb = employee.getPhoneNumber().split("");
            StringBuilder actualPhoneNumber = new StringBuilder("+7(");
            int i = 0;
            for (String a: tempNumb){
                if (i == 3){
                    actualPhoneNumber.append(")");
                }
                if (i == 6 || i == 8){
                    actualPhoneNumber.append("-");
                }
                actualPhoneNumber.append(a);
                i++;
            }
            employee.setPhoneNumber(actualPhoneNumber.toString());
            return "show-emp-details-view";
        }
    }

}
