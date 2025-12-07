package com.nadia.rest.webservices.restful_web_services.HelloWorld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    //@RequestMapping(method = RequestMethod.GET, path = "hello-world")
    @GetMapping(path = "hello-world") // more readable
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "hello-world-bean") 
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean!");
    }

     @GetMapping(path = "hello-world/path-variable/{name}") 
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s!", name));
    }

      @GetMapping(path = "hello-world-internationalized") // more readable
    public String helloWorldInternationalized() {
        Locale localeContextHolder = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", localeContextHolder);
    }
}
