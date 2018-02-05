package com.cloudstudy.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/configTest", method = RequestMethod.POST)
    @ApiOperation(value = "配置", httpMethod = "POST", produces = "application/json; charset=utf-8", notes = "Internal")
    @ResponseBody
    public String configTest() {
        return foo + name;
    }
}
