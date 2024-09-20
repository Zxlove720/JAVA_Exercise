package com.wzb.springbootmybatis20240920.ThreeLevelsExercise20240920.controller;

import com.wzb.springbootmybatis20240920.Pojo.Emp;
import com.wzb.springbootmybatis20240920.Pojo.Result;

import com.wzb.springbootmybatis20240920.ThreeLevelsExercise20240920.service.Service;
import com.wzb.springbootmybatis20240920.ThreeLevelsExercise20240920.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 注解
@RestController
public class Controller {
    @Autowired
    ServiceInterface service;


    @RequestMapping("/emp")
    public Result listEmp() {
        List<Emp> empList = service.getList();
        return Result.success(empList);
    }
}
