package JavaReview120240903;

public class JavaReview1 {
    public static void main(String[] args) {
        // 类：C语言的最基本组成单元是函数，而Java最基本的组成单元是类
        // 一个完整的Java项目一般由成千上万个类组成

        // Java中整数的默认类型是int，浮点数的默认类型是double
        // 所以说想要获得long类型或者float类型的变量，需要特别处理
        long number1 = 123456789L;  // 要在后面加上L代表是一个long类型的变量而非int
        float number2 = 3.1415926F; // 要在后面加上F代表是一个float类型的变量而非double
        System.out.println(getType(number1));
        System.out.println(getType(number2));
        Long number = new Long(123456L);
        System.out.println(number.getClass().getSimpleName());
        // 通过ASCII码表进行char和int的转换
        char c1 = 'A';
        System.out.println((int) c1);
        int c2 = 65;
        System.out.println((char)c2);

    }
    public static String getType(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
