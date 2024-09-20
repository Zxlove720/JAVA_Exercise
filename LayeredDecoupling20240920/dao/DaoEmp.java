package com.wzb.springbootmybatis20240920.LayeredDecoupling20240920.dao;

import com.wzb.springbootmybatis20240920.Pojo.Emp;
import com.wzb.springbootmybatis20240920.ThreeLevelsExercise20240920.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoEmp implements DaoInterfaceEmp {
    @Override
    public List<Emp> getList() {
        // 加载.xml文件
        String filePath = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        // 利用dom4j解析.xml文件
        // parse方法需要两个参数，需要解析文件的路径和要解析成的对象
        List<Emp> empList = XmlParserUtils.parse(filePath, Emp.class);
        return empList;
    }
}
