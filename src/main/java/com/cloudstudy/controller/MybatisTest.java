package com.cloudstudy.controller;

import com.cloudstudy.dao.UserDao;
import com.cloudstudy.domain.UserBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 2018/2/6.
 */
@Controller
public class MybatisTest {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/mybatisTest", method = RequestMethod.POST)
    @ApiOperation(value = "保存数据")
    @ResponseBody
    public String save(@RequestBody UserBean userBean) {
        System.out.println(userBean);
        userDao.insert(userBean);
        return "success";
    }
}
