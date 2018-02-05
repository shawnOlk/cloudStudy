package com.cloudstudy.controller;

import com.cloudstudy.exception.MyException;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 2018/2/5.
 */
@Controller
public class ExceptionTestController {
    @ApiOperation(value = "测试ControllerAdvice")
    @RequestMapping(value = "/exception")
    @ResponseBody
    public String exceptionTest() throws MyException {
        throw new MyException(1, "test exception!!!");
    }
}
