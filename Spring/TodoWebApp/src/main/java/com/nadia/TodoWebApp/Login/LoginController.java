package com.nadia.TodoWebApp.Login;
import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;

    
// if not initializong the get null and doesnt run!!!!
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method=RequestMethod.GET)
    public String login() {

      return "login";
    }

    ///User fills a form:
//name: Nadia
//password: 1234
//They click "Submit".
//Browser sends POST → /login
//This method runs.
//Spring loads welcome.html and injects:
//name → "Nadia"
//password → "1234"
//User sees a personalized welcome page.

    @RequestMapping(value="login", method=RequestMethod.POST)
    // Spring will extract the form values from the request.
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        //this is getting triggers in jsp only if doesnt match
        model.put("error", "invalid username or password, Please try again!!!"); 
        return "login";
     
    }
}
