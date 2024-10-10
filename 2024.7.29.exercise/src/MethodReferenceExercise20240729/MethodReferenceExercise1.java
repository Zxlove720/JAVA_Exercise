package MethodReferenceExercise20240729;

public class MethodReferenceExercise1 {
    public static void main(String[] args) {
        // 方法引用是Lambda表达式的孪生兄弟，其思想是：把已经定义好的名字和方法，当做Lambda 表达式来使用。

        /* 在Lambda中所指定的操作方案，已经在有地方存在相同的方案，没有必要再用Lambda表达式再重复地写一次
        相同的逻辑了，所以说引入了方法引用的思想 */

        // 方法引用符  :: 该符号为引用运算符，它所在的表达式被称为方法引用

        // 引用类方法（静态方法）
        // 类名::静态方法

        // 1.匿名内部类
        useConverter(new Converter() {
            @Override
            public int convert(String s) {
                return Integer.parseInt(s);
            }
        });
        // 2.lambda表达式
        useConverter(s -> Integer.parseInt(s));
        // 3.静态方法引用
        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number + 1);
    }

    /* Converter是一个接口，里面有个convert方法；useConverter是一个方法，需要一个Converter对象，但是想要Converter对象就需要
    重写里面的convert方法，converter方法会将一个字符串转换为int然后返回。用匿名内部类和lambda表达式，可以看见Converter内部的
    逻辑就是使用Integer中的parseInt方法来进行转换并且返回。所以说方法引用可以直接用Integer中的parseInt方法来简化代码
     */
}


