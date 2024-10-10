package FieldExercise20240831;

import ClassReflect20240831.Student;

import java.lang.reflect.Field;

public class FieldExercise {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // 反射获取成员变量
        // 其方法使用和反射获取构造方法是一致的，不过多赘述

        Class<?> studentClass = Class.forName("ClassReflect20240831.Student");

        // Field[] getField() 返回所有public修饰的成员变量对象构成的数组
        // Field[] getDeclaredField() 返回所有成员变量对象构成的数组，无视权限修饰
        Field[] fields1 = studentClass.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("--------------------------------");

        Field[] fields2 = studentClass.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }

        System.out.println("--------------------------------");

        // Field getField(String name) 返回指定的public修饰的单个成员变量对象
        // Field getDeclaredField(String name) 返回指定的成员变量对象，无视权限修饰
        Field field1 = studentClass.getField("age");
        System.out.println(field1);

        // 同样，和Constructor中的方法一样，若用getField获得private修饰的成员变量，则会报错
        /* Field field2 = studentClass.getField("name");
        System.out.println(field2); */

        System.out.println("--------------------------------");

        Field field2 = studentClass.getDeclaredField("name");
        System.out.println(field2);

        // 为成员变量赋值（如果本来有值就修改）
        // void set(Object obj, Object value)

        // 需要用setAccessible()方法临时取消被private修饰的成员变量的权限
        field2.setAccessible(true);
        Student student = new Student("李四", "男", 18);
        field2.set(student, "张三");
        System.out.println(student);

        // 获取成员变量的值
        // Object get(Object obj) 默认返回是Object，若已经确定get值的类型，则进行转换
        String name = (String)field2.get(student);
        System.out.println(name);
    }
}
