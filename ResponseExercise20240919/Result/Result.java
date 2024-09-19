package com.wzb.ResponseExercise20240919.Result;

public class
Result {
    private Integer code;  // 响应状态码：1代表成功；0代表失败
    private String message;  // 状态码信息 描述的字符串
    private Object data;  // 返回的数据，因为是返回的数据千奇百怪，所以说用顶级父类Object当作数据的类型

    public Result() {}

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // 为了提高效率，为成功响应和失败响应分别封装静态方法

    // 成功响应（不需要给前端返回数据）
    public static Result success() {
        return new Result(1, "success", null);
    }

    // 成功响应（需要给前端返回数据）
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    // 失败响应
    public static Result error(String message) {
        return new Result(0, "Fail", null);
    }
}
