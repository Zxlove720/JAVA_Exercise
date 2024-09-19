package com.wzb.ResponseImprove20240919;

import com.wzb.ResponseExercise20240919.Result.Result;
import com.wzb.ResponseExercise20240919.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Consumer;

@RestController
public class ResponseImprove {
    @RequestMapping("/listEmp")
    public Result list() {

        // 1. 加载并解析emp.xml

        // 动态获得xml文件路径
        // 1.this.getClass()方法获得该类（ResponseImprove）的对象
        // 2.getClassLoader()方法获得该类的类加载器
        // 3.getResource()方法，传递文件名，获得该文件的URL地址
        // 4.最后使用getFile()方法将得到的URL地址转换成字符串当作文件路径
        String filePath = this.getClass().getClassLoader().getResource("emp.xml").getFile();

        // 用XmlParserUtils工具类中的parse方法解析xml文件，解析为一个个emp对象，并存入集合返回
        List<Emp> empList = XmlParserUtils.parse(filePath, Emp.class);

        // 2.按照业务需求，对解析的数据进行处理
        // 处理 gender 1: 男, 2: 女
        // 处理 job - 1: 讲师, 2: 班主任 , 3: 就业指导

        // steam流和lambda表达式
        empList.stream().forEach(emp -> {
                // 先处理性别
                String gender = emp.getGender();
                if (gender.equals("1")) {
                    emp.setGender("男");
                } else if (gender.equals("2")) {
                    emp.setGender("女");
                } else {
                    emp.setGender("Error");
                }
                // 再处理职务
                String job = emp.getJob();
                switch (job) {
                    case "1" -> emp.setJob("讲师");
                    case "2" -> emp.setJob("班主任");
                    case "3" -> emp.setJob("就业指导");
                    default -> emp.setJob("Other");
                }

        });

        // 3. 响应数据
        return Result.success(empList);
    }
}

// 产生问题
// 在上述案例中，解析XML数据、获取解析后的数据、处理数据逻辑的代码全部都写在了一起，若有一处有改动，那么代码的改动量则会非常大
// 这会导致工程代码的复用性极差，所以说需要分层开发，而主要的解决方法是分层解耦
