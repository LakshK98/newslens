package com.newslens.newslens;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FirstController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
