package com.zx5435.pcmoto.common.mylib;

public class MyException extends RuntimeException {

    private Integer code;
    private String message;

    public String toString() {
        return "MyException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
