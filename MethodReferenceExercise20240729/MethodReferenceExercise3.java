package MethodReferenceExercise20240729;

import org.w3c.dom.ls.LSOutput;

public class MethodReferenceExercise3 {
    public static void main(String[] args) {
        // 引用类的实例方法
        // 类名::成员方法

        // 匿名内部类
        useMyString(new MyString() {
            @Override
            public String mySubString(String s, int start, int end) {
                return s.substring(start, end);
            }
        });

        // Lambda表达式
        useMyString((s, start, end) -> s.substring(start, end));

        // 方法引用
        useMyString(String::substring);

    }

    private static void useMyString(MyString ms) {
        String result = ms.mySubString("HelloWorld", 2 ,5);
        System.out.println(result);
    }
}

interface MyString{
    String mySubString(String s, int start, int end);
}