package com.xtpeach.minimal.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://patorjk.com/software/taag/#p=display&h=0&v=1&f=ANSI%20Shadow&t=minima
    @GetMapping(value = "/hello")
    public String hello() {
        return "minimal";
    }
}