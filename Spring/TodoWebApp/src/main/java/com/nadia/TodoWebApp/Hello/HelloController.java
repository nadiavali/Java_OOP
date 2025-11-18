package com.nadia.TodoWebApp.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Handles requests to /say-hello and returns a plain text message
// This controller maps the /say-hello URL to a method that returns a greeting string
// When the user goes to /say-hello in the browser, this method runs and returns a text response

@Controller
public class HelloController {

    // @RequestMapping("say-hello")
    // // @ResponseBody makes all controller methods return data directly in the HTTP response
    // // instead of trying to render a view template
    // // return the string as is
    // @ResponseBody 
    // public String SayHello() {
    //     return "HI, What you wanna learn now?";
    // }


    // @GetMapping("hello")
    // public String HelloHTML() {
    //   return "hello";
    // }

    // JSP Java server page
    // "hello-jsp" --->sayHello.jsp



    @GetMapping("hello-jsp")
    public String helloJsp() {
      return "sayHello";
    }

  
}


