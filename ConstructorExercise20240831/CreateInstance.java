package ConstructorExercise20240831;

import ClassReflect20240831.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 通过反射获取其构造方法，并实例化对象
        // Instance：实例
        // 方法：newInstance()，需要用Constructor对象调用

        // 获得Student的Class对象
        Class<?> studentClass = Class.forName("ClassReflect20240831.Student");
        // 获得Student的构造方法Constructor对象
        Constructor<?> constructor = studentClass.getConstructor(String.class, String.class, int.class);
        // 通过Constructor对象的newInstance方法创建对象
        Student student = (Student) constructor.newInstance("张三", "男", 18);
        // newInstance中的参数就是Constructor对应的构造方法的形参
        System.out.println(student);

        System.out.println("----------------------------------");

        // 即使通过getDeclaredConstructor方法获得了private修饰的构造方法，也不能直接使用，否则报错
        Constructor<?> constructor2 = studentClass.getDeclaredConstructor(String.class);
        // 要使用setAccessible()方法临时取消其权限，才可以正常使用，这个操作也称为“暴力反射”
        constructor2.setAccessible(true);
        Student student2 = (Student) constructor2.newInstance("李四");
        System.out.println(student2);
    }
}
