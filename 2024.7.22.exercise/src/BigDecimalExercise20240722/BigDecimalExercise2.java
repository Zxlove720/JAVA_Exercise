package BigDecimalExercise20240722;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExercise2 {
    public static void main(String[] args) {
        // BigDecimal的常用方法：主要是进行加减乘除的四则运算
        // BigDecimal中的所有运算，都是精确计算，理论上不存在误差

        // 1.add
        BigDecimal bigDecimal1 = new BigDecimal("3.1415926");
        BigDecimal bigDecimal2 = new BigDecimal("1.165466");
        System.out.println(bigDecimal1.add(bigDecimal2)); // 绝对的精确，和理论值一模一样 4.3070586
        System.out.println(3.1415926 + 1.165466); // 不用BigDecimal计算，则产生误差 4.3070585999999995
        System.out.println("------------------------------------------------------");

        // 2.subtract
        BigDecimal bigDecimal3 = new BigDecimal("0.1");
        BigDecimal bigDecimal4 = new BigDecimal("0.09");
        System.out.println(bigDecimal3.subtract(bigDecimal4)); // 绝对精确 0.01，调用者减参数
        System.out.println(0.1 - 0.09); // 产生误差 0.010000000000000009
        System.out.println("------------------------------------------------------");

        // 3.multiply
        BigDecimal bigDecimal5 = new BigDecimal("0.1");
        BigDecimal bigDecimal6 = new BigDecimal("0.1");
        System.out.println(bigDecimal5.multiply(bigDecimal6)); // 绝对精确 0.01
        System.out.println(0.1 * 0.1); // 产生误差 0.010000000000000002
        System.out.println("------------------------------------------------------");

        // 4.divide
        BigDecimal bigDecimal7 = new BigDecimal("0.3");
        BigDecimal bigDecimal8 = new BigDecimal("0.1");
        System.out.println(bigDecimal7.divide(bigDecimal8, 2, RoundingMode.HALF_UP)); // 绝对精确 3
        System.out.println(0.3 / 0.1); // 产生误差2.9999999999999996
        // 不能除尽
        BigDecimal bigDecimal9 = new BigDecimal("1");
        BigDecimal bigDecimal10 = new BigDecimal("3");
        System.out.println(bigDecimal9.divide(bigDecimal10, 2, RoundingMode.HALF_UP));
        // 在BigDecimal中，假如不能除尽，则会抛出异常，或者指定一个舍入模式和精度。
        // 2表示保留小数点后两位，RoundingMode.HALF_UP 表示使用四舍五入的方式进行舍入


        // 底层存储模式：
        // 把数据看成字符串，遍历得到里面的每一个字符，把这些字符在ASCII码表上的值，都存储到数组中。
        // 如"0.226"在底层存的是[48, 46, 50, 50, 54]，是0.226所对应的ASCII码值

    }
}
