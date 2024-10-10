package BigDecimalExercise20240722;
import java.math.BigDecimal;
public class BigDecimalExercise1 {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01); // 0.09999999999999999
        // 在java中进行小数的运算，大部分时候都会产生精度丢失（c语言一般不会产生这样的情况）
        /* 精度丢失产生的原因：因为计算机底层数据都是以二进制存储的，但是float和double类型
           的小数位数是有限的，有可能无法表示完这么多位，所以说产生精度丢失
           两个主要原因：1.有些小数无法用二进制精确表示，如：0.1，所以说存储时一定会产生精度丢失
           2.float有23位小数位，double有52位小数位，所以说有些小数即使可以用很多位数二进制来精确表示
           但是当超出这两个类型的小数位数之后，则会导致精度丢失 */
        // 每个浮点数都会有一定误差，假如误差之间再进行运算，那么误差只会越来越大，产生不符合数学的结果

        // 为了在一些需要精度计算的领域解决这个问题，引入了BigDecimal这个类，可以对Java中的浮点数精确计算

        // 构造方法
        // 1.BigDecimal(int value) 将一个int类型的整数转换为一个BigDecimal类
        BigDecimal bigDecimal1 = new BigDecimal(123);
        System.out.println(bigDecimal1);

        // 2.BigDecimal(long value) 将一个long类型的长整数转换为一个BigDecimal类
        BigDecimal bigDecimal2 = new BigDecimal(15646546546L);
        System.out.println(bigDecimal2);

        // 3.BigDecimal(String value) 将一个字符串转换为一个BigDecimal类
        BigDecimal bigDecimal3 = new BigDecimal("4564654.4654");
        System.out.println(bigDecimal3);





    }
}
