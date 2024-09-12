package JavaReflectExercise20240912;

import java.lang.reflect.Method;

public class JavaReflectExercise {
    public static void main(String[] args) {
        try {
            // 获取Class对象
            Class<?> clazz = Class.forName("com.example.Person");

            // 创建对象实例
            Object person = clazz.getDeclaredConstructor().newInstance();

            // 获取方法
            Method setNameMethod = clazz.getMethod("setName", String.class);
            Method getNameMethod = clazz.getMethod("getName");

            // 调用方法
            setNameMethod.invoke(person, "Alice");
            String name = (String) getNameMethod.invoke(person);

            System.out.println("Name: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}