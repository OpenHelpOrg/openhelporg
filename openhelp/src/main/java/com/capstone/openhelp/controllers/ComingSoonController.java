package com.capstone.openhelp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ComingSoonController {
    @GetMapping("/comingsoon")

    public String comingSoon(){
        return "comingsoon";
    }
}
