package com.wzb.springbootmybatis20240920.LayeredDecoupling20240920.controller;

import com.wzb.springbootmybatis20240920.Pojo.Emp;
import com.wzb.springbootmybatis20240920.Pojo.Result;
import com.wzb.springbootmybatis20240920.LayeredDecoupling20240920.service.ServiceInterfaceEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerEmp {
    @Autowired
    private ServiceInterfaceEmp service;



    @RequestMapping("/emptest")
    public Result listEmp() {
        List<Emp> empList = service.getList();
        return Result.success(empList);
    }
}
