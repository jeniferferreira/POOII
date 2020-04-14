package com.example.atividade1_ac1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "helloView";
    }

}