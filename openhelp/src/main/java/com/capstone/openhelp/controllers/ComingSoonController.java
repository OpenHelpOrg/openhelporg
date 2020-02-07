package com.capstone.openhelp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComingSoonController {
    @GetMapping("/comingsoon")

    public String comingsoon(){
        return "comingsoon";
    }
}
