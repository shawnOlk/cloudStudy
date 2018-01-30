package com.cloudstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 28/01/2018.
 */
@Controller
public class config {
    @Value("${config.env}")
    String foo;
    @Value("${config.author}")
    String name;

    @ResponseBody
    @RequestMapping(value = "/configTest")
    public String configTest() {
        return foo + name;
    }
}
