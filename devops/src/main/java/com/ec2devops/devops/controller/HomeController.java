package com.ec2devops.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/msg")
    public String msg(@RequestParam String msg) {
        return msg;
    }
}
