package com.nadia.TodoWebApp.Login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String login(ModelMap model) {
        model.put("name", "Nadia");
        return "welcome";
    }

 
}
