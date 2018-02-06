package com.cloudstudy.domain;


import lombok.Data;

/**
 * Created by sunlei on 2018/2/6.
 */
@Data
public class UserBean {
    private Long userId;
    private String userName;
    private String password;
    private String phone;
}
