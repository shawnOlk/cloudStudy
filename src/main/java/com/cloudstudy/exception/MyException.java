package com.cloudstudy.exception;

/**
 * Created by sunlei on 2018/2/5.
 */
public class MyException extends Exception {
    private int code;

    private String message;

    public MyException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
