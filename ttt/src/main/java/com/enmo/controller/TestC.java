package com.enmo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestC {
    
    
    @RequestMapping(value= "hello",method = RequestMethod.GET)
    public String s () {
        return "hello";
    }

}
