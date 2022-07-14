package com.company.M4Project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsoleController {
    @GetMapping("/consoles")
    @ResponseStatus(HttpStatus.OK)
    public String gettinAllConsoles(){
        return "Yooo";
    }
}
