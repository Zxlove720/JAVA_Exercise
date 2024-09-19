package com.wzb.ThreeLevelsExercise20240919.Service;

import com.wzb.ResponseImprove20240919.Emp;
import com.wzb.ThreeLevelsExercise20240919.Dao.EmpADao;
import com.wzb.ThreeLevelsExercise20240919.Dao.EmpDao;

import java.util.List;
import java.util.function.Consumer;

// 业务实现类
public class EmpAService implements EmpService{
    // 获得dao层对象
    private EmpDao empDao = new EmpADao();

    // 按照业务逻辑处理员工数据
    @Override
    public List<Emp> listEmp() {
        // 1.调用dao层，获取数据
        List<Emp> empList = empDao.listEmp();

        // 2.按照业务逻辑，对得到的数据进行处理
        empList.stream().forEach(new Consumer<Emp>() {
            @Override
            public void accept(Emp emp) {
                String gender = emp.getGender();
                if (gender.equals("1")) {
                    emp.setGender("男");
                } else if (gender.equals("女")) {
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
        // 返回员工表
        return empList;
    }
}
