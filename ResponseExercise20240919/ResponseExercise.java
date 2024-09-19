package com.wzb.ResponseExercise20240919;


import com.wzb.ResponseExercise20240919.Result.Result;
import com.wzb.ResponseExercise20240919.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


// 添加RestController注解，表示此类中所有方法的返回值都作为浏览器的响应数据

@RestController
public class ResponseExercise {
    // Controller方法中，已经设置了响应浏览器请求的数据
    // Controller方法中的return的结果，是通过@ResponseBody注解响应给浏览器的

    // @ResponseBody注解
    // 1.类型：方法注解，类注解；可以为类或者方法进行注解
    // 2.位置：书写在@Controller方法或者类上
    // 3.作用：将方法返回值直接响应给浏览器（如果方法返回值是实体对象/集合），那么将会转换为json格式后再响应给浏览器

    // 但是在一般的书写中，只是在类上添加了@RestController的注解，方法添加了@RequestMapping注解，并没有直接使用@RespondBody注解
    // 是因为@RestContorller是一个组合注解，是@Controller和@ResponseBody的组合，所以说不需要直接使用@RespondBody就可以响应浏览器

    // 可以理解为添加了@RestController注解就相当于添加了@ResponseBody注解

    // 类上有@RestController注解或者@ResponseBody注解时，表示当前类下所有的方法的返回值都作为浏览器的响应参数


    /* 无参数的请求 */
    @RequestMapping("/Hello")
    public Result function() {
        System.out.println("hello world");
        return Result.success("Hello World");
    }

    /* 请求普通参数 */
    @RequestMapping("/simpleParam")
    public Result simpleParam(String name) {
        System.out.println("I am " + name);
        return Result.success(("I am " + name));
    }

    /* 请求普通参数的复杂写法 */
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        int age = Integer.parseInt(request.getParameter("age"));
//        System.out.println(name + ": " + age);
//        return (name + ": " + age);
//    }

    /* 请求实体对象 */
    /* 若响应的是实体对象，那么前端将会以json格式展示出来 */
    @RequestMapping("/simplePojo")
    public Result simplePojo (User user) {
        System.out.println(user);
        return Result.success(user);
    }

    /* 请求数组 */
    @RequestMapping("/simpleArray")
    public Result simpleArray(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return Result.success(hobby);
    }

    /* 请求集合 */
    /* 因为默认是响应数组，所以说想要响应集合需要用@RequestParam注解 */
    @RequestMapping("/simpleList")
    public Result simpleList(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return Result.success(hobby);
    }

    /* 请求时间日期参数 */
    @RequestMapping("/updateTime")
    public Result dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println("现在的时间是： " + updateTime);
        return Result.success(updateTime);
    }

    /* 请求json参数 */
    @RequestMapping("/jsonParam")
    public Result jsonParam(@RequestBody User user) {
        System.out.println(user);
        return Result.success(user);
    }
}
