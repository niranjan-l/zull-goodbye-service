package com.niranjan2021.zullgoodbyeservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Value("${server.port}")
    public  String port;
    @RequestMapping
    public  String goodBye(){
        return  "good bye"+ "and server running at "+port;
    }
}
