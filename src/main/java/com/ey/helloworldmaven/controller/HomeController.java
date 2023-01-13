package com.ey.helloworldmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/homes")
@Controller
public class HomeController {

    @GetMapping
    public String welcome(){
        return "home";
    }
}
