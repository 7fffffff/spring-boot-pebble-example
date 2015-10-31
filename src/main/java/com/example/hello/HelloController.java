package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("hello");
        return mav;
    }
}