package com.cloudstudy.controller;

import com.cloudstudy.facade.EurekaTestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunlei on 28/01/2018.
 */
@RestController
public class hello {
    @Autowired
    private EurekaTestFacade eurekaTestFacade;
    @ResponseBody
    @RequestMapping(value = "/")
    public String hello(){
        return eurekaTestFacade.getName();
    }

}
