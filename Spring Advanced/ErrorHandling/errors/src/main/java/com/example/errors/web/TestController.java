package com.example.errors.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(){

        if (true) {
            throw new NullPointerException("Wow, i did it again!");
        }

        return "hello";
    }
}
