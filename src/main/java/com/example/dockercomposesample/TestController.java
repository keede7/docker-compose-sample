package com.example.dockercomposesample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String main() {
        return "main";
    }


    @GetMapping("/test")
    public String test() {

        return "test";
    }
}
