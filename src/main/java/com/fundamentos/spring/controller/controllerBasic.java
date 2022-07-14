package com.fundamentos.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class controllerBasic {

    @GetMapping(path = {"/saludar", "/saludar2"})
    public String saludar(){
        return "index";
    }
}
