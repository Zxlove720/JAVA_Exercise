package com.wzb.ThreeLevelsExercise20240919.Dao;

import com.wzb.ResponseImprove20240919.Emp;

import java.util.List;

// 数据访问层接口（指定标准）
public interface EmpDao {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
