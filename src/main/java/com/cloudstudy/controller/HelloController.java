package com.cloudstudy.controller;

import com.cloudstudy.facade.EurekaTestFacade;
import com.cloudstudy.facade.FeignTestFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunlei on 28/01/2018.
 */
@RestController
public class HelloController {
    @Autowired
    private EurekaTestFacade eurekaTestFacade;
    @Autowired
    private FeignTestFacade feignTestFacade;

    /**
     * feign 调用
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/")
    @ApiOperation(value="测试hello", notes="")
    public String hello(){
        return feignTestFacade.getName();
    }

    /**
     * restTemplate调用
     */
//    @ResponseBody
//    @RequestMapping(value = "/")
//    public String hello(){
//        return eurekaTestFacade.getName();
//    }
}
