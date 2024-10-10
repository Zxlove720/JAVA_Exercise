package BigIntegerExercise20240722;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;


public class BigIntegerExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 为什么引入BigInteger？
        // int类型不够大，long也不够大，引入BigInteger类，理论最大值42亿的21亿次方，理论无限大

        // BigInteger的构造方法
        // public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]
        // public BigInteger(String val) 				//获取指定的大整数
        // public BigInteger(String val, int radix) 	//获取指定进制的大整数

        // 1.获得随机大整数
//        int i = 10;
//        for (int j = 0; j < i; j++) {
//            BigInteger bi1 = new BigInteger(10, new Random()); // 生成随机大整数(0-2的10次方-1(0-1023))
//            System.out.println(bi1);
//        }
//
//        // 2.获得指定的大整数
//        System.out.println("你想获得什么大整数?");
//        String big = sc.nextLine();
//        BigInteger bigNumber = new BigInteger(big);
//        System.out.println("BigInteger对象是:" + bigNumber);
//
//        // 3.获取指定进制的大整数
//        BigInteger bigint = new BigInteger("11100111000", 2);
//        // 传递两个参数，第一个是字符串类型的数字，第二个参数是进制，注意第一个参数不能超越进制--->(110, 2)就是在2进制下的110，也就是6 ，返回的也是6
//        System.out.println(bigint); // 返回的是10进制的数字

          // 4.可以通过静态方法获得BigInteger对象，不是构造方法！
          // public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
        BigInteger bigInteger = BigInteger.valueOf(5);
        System.out.println(bigInteger);
        // 参数是long类型的整数，如果想要一个没有超过long类型的BigInteger对象，建议使用valueOf静态方法
        // 如果超过long类型的取值，那么通过构造方法创建BigInteger对象，传递字符串，理论无限大！


        // 细节:BigInteger对象一旦创建，内部的值是不会改变的，参与计算实际上是产生了一个新的BigInteger对象





    }
}
