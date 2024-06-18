package com.example.dockercomposesample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//     1. Registry 이미지 올라가는지,
//            2. pull 되는지,

    @GetMapping("/")
    public String main() {
        return "main";
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
