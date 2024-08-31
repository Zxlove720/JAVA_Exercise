package MethodExercise20240831;

import ClassReflect20240831.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExercise {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 反射获取成员方法
        // 其方法使用和Constructor一样，不过多赘述

        // 获得Class类对象
        Class<?> studentClass = Class.forName("ClassReflect20240831.Student");

        // Method[] getMethods() 返回public修饰的所有成员方法对象的数组 （包含父类继承的方法）
        // Method[] getDeclaredMethods() 返回所有成员方法对象的数组，无视权限修饰 （不包含父类继承的方法）
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        // 遍历返回的数组可以发现，包含了所有的public修饰的方法，还有Student类父类继承的方法（Object）

        System.out.println("-------------------------------");

        Method[] methods2 = studentClass.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }
        // 遍历返回的数组可以发现，包含了Student中所有的成员方法，但是不包括父类继承的方法

        System.out.println("-------------------------------");

        // Method getMethod(String name, Class<?>...parameterTypes) 返回指定public修饰的成员方法
        // Method getDeclaredMethod(String name, Class<?> parameterTypes) 返回指定的成员方法

        Method method1 = studentClass.getMethod("eat", String.class);
        System.out.println(method1);

        Method method2 = studentClass.getDeclaredMethod("study");
        System.out.println(method2);

        System.out.println("-------------------------------");

        // 运行获取的成员方法
        // Object invoke(Object obj, Object...args)
        Student student = new Student("张三", "男", 18);
        method1.invoke(student, "汉堡包");

        // 同样的问题，虽然获取了private修饰的方法，但不能直接使用，要用setAccessible()临时去除其权限
        method2.setAccessible(true);
        method2.invoke(student);
    }
}
