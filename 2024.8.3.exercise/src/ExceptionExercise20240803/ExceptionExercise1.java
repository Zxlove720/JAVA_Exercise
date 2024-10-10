package ExceptionExercise20240803;

public class ExceptionExercise1 {
    public static void main(String[] args) {
        // Exception异常，是Java中的一个类，用来表示在程序的执行过程中，出现的异常状况，会导致JVM非正常停止
        // 异常主要是提醒人们

        // Error，这是非常严重的错误，一般是系统内部的错误，程序员无法解决，只能避免
        // Exception，是异常，程序员可以根据报错的信息对其处理

        // Error和Exception都是继承于Throwable的，Throwable算是一个异常的体系

        // Throwable
        // void printStackTrace() 打印异常的详细信息----包括异常类型、原因、出现位置，被广泛使用
        // String getMessage() 获取发生异常的原因----一般是提供给用户的简洁异常原因
        // String toString() 获取异常的类型和异常的描述信息----但是不如printStackTrace好用

        Exception e = new ArrayIndexOutOfBoundsException();
        String exception = e.getMessage();
        System.out.println(exception); // null
        // 因为此处没有异常的原因，所以说是null
        String result = e.toString();
        System.out.println(result); // java.lang.ArrayIndexOutOfBoundsException
        // 得到了异常的类型和描述
        System.err.println("---------------------");
        // System.err + 输出语句，可以输出和异常一样颜色的语句
        e.printStackTrace();
        // Exception继承了Throwable，所以说这些方法都能用（底层也是用的这些）
    }
}
