package com.wzb.ThreeLevelsExercise20240919.Controller;

import com.wzb.ResponseExercise20240919.Result.Result;
import com.wzb.ResponseImprove20240919.Emp;
import com.wzb.ThreeLevelsExercise20240919.Service.EmpAService;
import com.wzb.ThreeLevelsExercise20240919.Service.EmpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 控制层：接收前端发送的请求，对请求进行处理，并响应数据
@RestController
public class EmpController {
    // 获得业务层对象
    private EmpService empService = new EmpAService();

    @RequestMapping("/listEmpTogether")
    public Result list() {
        // 调用service层，获取数据
        List<Emp> empList = empService.listEmp();
        // 响应数据
        return Result.success(empList);
    }
}
