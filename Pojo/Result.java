package com.wzb.springbootmybatis20240920.Pojo;

public class Result {
    private String code;
    private String message;
    private Object data;

    public Result() {}

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success() {
        return new Result("1", "success", null);
    }

    public static Result success(Object data) {
        return new Result("1", "success", data);
    }

    public static Result fail() {
        return new Result("0", "fail", null);
    }
}
