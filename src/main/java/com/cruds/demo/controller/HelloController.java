package com.cruds.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }	
	
	@RequestMapping("/home")
    public String myHome() {
        return "Greetings from Home !";
    }	
	
	@RequestMapping("/login")
    public String showlogin() {
        return "Login Page to be displayed !";
    }	

	@RequestMapping("/logoff")
    public String logoff() {
        return "Logging Off";
    }		
}
