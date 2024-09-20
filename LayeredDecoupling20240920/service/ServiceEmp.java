package com.wzb.springbootmybatis20240920.LayeredDecoupling20240920.service;

import com.wzb.springbootmybatis20240920.Pojo.Emp;
import com.wzb.springbootmybatis20240920.LayeredDecoupling20240920.dao.DaoInterfaceEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Consumer;

@Component
public class ServiceEmp implements ServiceInterfaceEmp {

    @Autowired
    private DaoInterfaceEmp dao;


    @Override
    public List<Emp> getList() {
        List<Emp> empList = dao.getList();

        // 按照业务逻辑处理userList中的数据
        empList.forEach(new Consumer<Emp>() {
            @Override
            public void accept(Emp emp) {
                String gender = emp.getGender();
                if (gender.equals("1")) {
                    emp.setGender("男");
                } else if (gender.equals("2")) {
                    emp.setGender("女");
                } else {
                    emp.setGender("Error");
                }

                String job = emp.getJob();
                switch (job) {
                    case "1" -> emp.setJob("讲师");
                    case "2" -> emp.setJob("班主任");
                    case "3" -> emp.setJob("就业指导");
                    default -> emp.setJob("Other");
                }
            }
        });
        return empList;
    }
}
