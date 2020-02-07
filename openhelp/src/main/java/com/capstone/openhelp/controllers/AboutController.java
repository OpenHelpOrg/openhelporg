package com.capstone.openhelp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AboutController {

    @GetMapping
    public String aboutPage(){
        return "about";
    }

}
