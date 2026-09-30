package com.surya.spring_security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        return "Hello World" + request.getSession().getId();
    }

    @GetMapping("jobs")
    public String jobs() {
        return "Jobs";
    }

    @GetMapping("admin")
    public String admin(){
        return "ADMIN";
    }
}
