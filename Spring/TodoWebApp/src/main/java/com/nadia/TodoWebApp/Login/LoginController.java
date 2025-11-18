package com.nadia.TodoWebApp.Login;



import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name); // key in jsp: ${key}
        logger.info("I need this be printed at info level...");
        logger.warn("I wanna warn sth at warn level");
        logger.debug("Request param is " + name); // you can turn it off by property
      return "login";
    }
}
