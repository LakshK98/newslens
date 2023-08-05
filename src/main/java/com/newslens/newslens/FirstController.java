package com.newslens.newslens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
