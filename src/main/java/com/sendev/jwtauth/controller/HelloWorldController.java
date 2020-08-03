package com.sendev.jwtauth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage() {

        return "Hello World - senthil";
    }

}
