package com.wzb.springbootmybatis20240920.LayeredDecoupling20240920;

public class LayeredDecoupling {
    // 通过三层架构，成功给程序完成了分层，但三层中仍然是耦合的，需要对其进行解耦

    // 耦合的体现：因为三层架构中，三层都是以创建对象的方式建立联系的，当改变业务逻辑类时，仍然需要去修改代码

    // 解耦的思路：
    // 1.不在三层架构中使用创建对象的方式建立彼此的联系
    // 2.提供一个容器，容器中存储三层架构中每一层的对象
    // 3.controller程序从容器中取出需要使用的对象，而不是直接创建对象

    // Spring中两个核心概念完成解耦
    // 1.控制反转：Inversion Of Control（IOC）。对象的创建控制权由程序自身转移到外部（容器），这个思想被称为控制反转
    // 对象的创建权由程序员主动创建转移到容器（由容器创建、管理对象）。此容器称为：IOC容器或Spring容器

    // 2.依赖注入：Dependency Injection（DI）。容器为应用程序提供运行时所依赖的资源，称为依赖注入
    // 程序运行时需要某个资源，此时容器就为其提供这个资源

    // IOC容器中，创建和管理的对象称为：bean对象

    // 对三层架构进行分层解耦
    // 思路：
    // 1.删除Controller、Service层中new对象的代码
    // 2.Service层及Dao层的实现类，交给IOC容器管理
    // 3.为Controller及Service注入运行时需要依赖的对象
    //      （1）.Controller程序中注入依赖的Service层对象
    //      （2）.Service程序中注入依赖的Dao层对象

    // @Component注解可以将类交给IOC容器管理
    // 注：不能在容器中有两个

    // @Autowired注解可以在程序运行时从IOC容器自动注入需要的依赖对象



}
