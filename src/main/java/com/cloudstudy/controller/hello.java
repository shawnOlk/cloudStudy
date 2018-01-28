package com.cloudstudy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 28/01/2018.
 */
@Controller
@SpringBootApplication
public class hello {
    @ResponseBody
    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World!!!";
    }
    public static void main(String[] args){
        SpringApplication.run(hello.class,"--server.port=8081");
    }
}
