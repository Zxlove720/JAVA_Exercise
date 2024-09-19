package com.wzb.ThreeLevelsExercise20240919.Dao;

import com.wzb.ResponseExercise20240919.utils.XmlParserUtils;
import com.wzb.ResponseImprove20240919.Emp;

import java.util.List;

public class EmpADao implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 加载并解析emp.xml文件，然后返回数据
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
