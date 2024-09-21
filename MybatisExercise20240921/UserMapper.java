package com.wzb.MybatisExercise20240921;

import com.wzb.Pojo20240921.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// Mybatis的持久层接口规范一般是叫“XxxMapper”
@Mapper
public interface UserMapper {
    // 查询所有数据
    // 用注解的方式编写SQL语句
    @Select("select * from springboot.user")
    public List<User> getList();

    // 在创建出来的Springboot工程中，test目录下已经自动创建好了测试类，并且有@SpringBootTest注解，代表该测试类已经和Springboot整合
    // 测试类在运行时，会自动通过引导类加载Spring的环境（IOC容器）。要测试哪个bean对象，就可以直接通过@Autowired注解直接将其注入
}
