package com.example.springbootdockerproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestingController {

    @GetMapping("/testing")
    public String index() {
        return "index";
    }
}
