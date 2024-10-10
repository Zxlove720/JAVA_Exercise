package MethodReferenceExercise20240729;

public class MethodReferenceExercise2 {
    public static void main(String[] args) {
        // 引用对象的实例方法
        // 对象::成员方法

        // 匿名内部类
        usePrinter(new Printer() {
            @Override
            public void printUpperCase(String s) {
                String result = s.toUpperCase();
                System.out.println(result);
            }
        });

        // Lambda表达式
        usePrinter(s -> System.out.println(s.toUpperCase()));

        // 方法引用
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);


        /* PrintString是一个内部类，其中有个printUpper方法，我们想要用的就是这个printUpper方法
        Printer是一个接口，其中有个叫printUpperCase的方法，需要传递一个字符串对象并且不会返回值
        在测试类中有个usePrinter方法，需要传递一个Printer接口，为了实现这个接口对象，我们需要重写
        这个接口中的方法可以通过匿名内部类来实现，重写printUpperCase方法，接收一个字符串对象，将其
        转换为大写，然后输出（如果只需要转换为大写可以用静态方法引用）；可以用Lambda表达式实现；还可以
        通过创造PrintString类的对象，然后引用对象内的printUpper方法实现 */
    }
    private static void usePrinter(Printer p) {
        p.printUpperCase("Hello World ZXL");
    }
}

class PrintString{
    public void printUpper(String s) {
        String result = s.toUpperCase();
        System.out.println(result);
    }
}

interface Printer{
    void printUpperCase(String s);
}
