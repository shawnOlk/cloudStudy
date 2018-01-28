package com.cloudstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunlei on 28/01/2018.
 */
@RestController
public class hello {
    @ResponseBody
    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World!!!";
    }

}
