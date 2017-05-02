package com.atef.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Atef on 29/04/2017.
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String getHelloMessage(){
        return "Hello World!";
    }
}
