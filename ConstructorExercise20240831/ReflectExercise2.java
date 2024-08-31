package ConstructorExercise20240831;

import java.lang.reflect.Constructor;

public class ReflectExercise2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 反射获取类中的构造方法 Constructor
        // 反射都是从class字节码文件中获取的内容，所以说需要先获得Class对象，再对其进行操作
        Class<?> studentClass = Class.forName("ClassReflect20240831.Student");

        // Constructor<?>[] getConstructor() 返回一个Constructor对象数组，包含所有以public修饰的构造方法
        // Constructor<?>[] getDeclaredConstructor() 返回一个Constructor对象数组，包含所有的构造方法

        Constructor<?>[] constructors1 = studentClass.getConstructors();
        for (Constructor<?> con : constructors1) {
            // 成功得到了所有被public修饰的构造方法并遍历
            System.out.println(con);
        }

        System.out.println("---------------------------------");

        Constructor<?>[] constructors2 = studentClass.getDeclaredConstructors();
        for (Constructor<?> con : constructors2) {
            // 成功得到了Student类中所有的构造方法，包含所有权限修饰的构造方法
            System.out.println(con);
        }

        System.out.println("---------------------------------");

        // Constructor<T> getConstructor(Class<?>...parameterTypes) 获得由public修饰的指定构造（传递构造方法形参的参数类型对象）
        // Constructor<T> getConstructor(Class<?>...parameterTypes) 获得指定构造（传递构造方法形参的参数类型对象），无视权限

        Constructor<?> constructor3 = studentClass.getConstructor(String.class, String.class, int.class);
        System.out.println(constructor3);

        // 如果用getConstructor方法获取非public修饰的构造方法，则会报错：NoSuchMethodException
        /* Constructor<?> constructor4 = studentClass.getConstructor(String.class);
        System.out.println(constructor4); */

        // 如果用getDeclaredConstructor方法，则可以无视权限修饰，获取指定的构造方法
        Constructor<?> constructor4 = studentClass.getDeclaredConstructor(String.class);
        System.out.println(constructor4);
    }
}
