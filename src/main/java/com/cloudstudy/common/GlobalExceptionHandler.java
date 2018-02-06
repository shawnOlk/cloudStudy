package com.cloudstudy.common;

import com.cloudstudy.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunlei on 2018/2/5.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public String jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        return e.getMessage()+e.getCode();
    }
}
