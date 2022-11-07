package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi")
    public String mustacheCon(Model model) {
        // view 에 값을 넘기는 것 -> model.addAttribute()
        model.addAttribute("username", "rok");
        return "greetings"; // greetings 라는 이름의 view 를 return
    }

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon2(@PathVariable String id, Model model) {
        model.addAttribute("username", "rok");
        model.addAttribute("id",id);
        return "greetings";
    }
}
