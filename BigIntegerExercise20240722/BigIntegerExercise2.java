package BigIntegerExercise20240722;
import java.math.BigInteger;
public class BigIntegerExercise2 {
    public static void main(String[] args) {
        // BigInteger中使用得多的方法还是四则运算，因为引用数据类型无法直接通过运算符计算，所以说提供了其对应方法
        // 但是必须注意的细节:BigInteger对象一旦创建，内部的值是不会改变的，参与计算实际上是产生了一个新的BigInteger对象

//        public BigInteger add(BigInteger val)					 //加法
//        public BigInteger subtract(BigInteger val)			 //减法
//        public BigInteger multiply(BigInteger val)			 //乘法
//        public BigInteger divide(BigInteger val)				 //除法
//        public BigInteger[] divideAndRemainder(BigInteger val) //除法，获取商和余数
//        public  boolean equals(Object x) 					     //比较是否相同
//        public  BigInteger pow(int exponent) 					 //次幂、次方
//        public  BigInteger max/min(BigInteger val) 			 //返回较大值/较小值
//        public  int intValue(BigInteger val) 					 //转为int类型整数，超出范围数据有误
        // 从方法定义中也可以看到，方法是有BigInteger返回值的，所以说是产生了一个新的BigInteger对象

//        // 1.add(+)
//        BigInteger bigInteger1 = BigInteger.valueOf(123456);
//        BigInteger bigInteger2 = BigInteger.valueOf(456789);
//        System.out.println(bigInteger1.add(bigInteger2)); // add方法产生了一个新的BigInteger对象返回两个对象的和
//        System.out.println(bigInteger1); // 可见两个BigInteger对象的值没有发生任何改变
//        System.out.println(bigInteger2);
//        System.out.println("------------------------------------------");
//
//        // 2.subtract(-)
//        BigInteger bigInteger3 = BigInteger.valueOf(91);
//        BigInteger bigInteger4 = BigInteger.valueOf(90);
//        System.out.println(bigInteger3.subtract(bigInteger4)); // subtract方法是调用者减参数，并创建新的对象返回
//        System.out.println(bigInteger3); // 原来的对象是没有改变的
//        System.out.println(bigInteger4);
//        System.out.println("------------------------------------------");
//
//        // 3.multiply(*)
//        BigInteger bigInteger5 = BigInteger.valueOf(5);
//        BigInteger bigInteger6 = BigInteger.valueOf(8);
//        System.out.println(bigInteger5.multiply(bigInteger6)); // 乘法和上面同理
//        System.out.println(bigInteger5);
//        System.out.println(bigInteger6);
//        System.out.println("------------------------------------------");
//
//        // 4.divide(/)
//        BigInteger bigInteger7 = BigInteger.valueOf(8);
//        BigInteger bigInteger8 = BigInteger.valueOf(5);
//        System.out.println(bigInteger7.divide(bigInteger8)); // 除法是调用者除参数，和减法的顺序一样
//        System.out.println(bigInteger7); // 假如无法除尽，则会舍去小数部分，向下取整
//        System.out.println(bigInteger8);

//        // 5.divideAndRemainder(除法，获得商和余数)，会返回一个BigInteger数组，数组里面只有两个元素分别是商和余数
//        BigInteger bigInteger1 = BigInteger.valueOf(8);
//        BigInteger bigInteger2 = BigInteger.valueOf(5);
//        BigInteger[] array = bigInteger1.divideAndRemainder(bigInteger2);
//        for (BigInteger result : array) {
//            System.out.println(result); // 前一个BigInteger是商：1；后一个BigInteger是余数：3
//        }

         // 1.equals 方法比较两个BigInteger是否相同
        BigInteger bigInteger1 = BigInteger.valueOf(8);
        BigInteger bigInteger2 = BigInteger.valueOf(8);
        System.out.println(bigInteger1.equals(bigInteger2)); // BigInteger已经重写好了equals方法，比的不是地址值而是实际值
        System.out.println("------------------------------------------");

        // 2.pow 返回次幂
        BigInteger bigInteger3 = BigInteger.valueOf(2);
        System.out.println(bigInteger3.pow(10)); // 返回调用者的参数次幂，参数是int
        System.out.println(bigInteger3); // 调用者是没有改变的，可见是创建的新的对象返回
        System.out.println("------------------------------------------");

        // 3.max\min 返回两个BigInteger的较大值\较小值
        BigInteger bigInteger4 = BigInteger.valueOf(10);
        BigInteger bigInteger5 = BigInteger.valueOf(15);
        System.out.println(bigInteger4.max(bigInteger5)); // 返回调用者和参数二者的较大值：15
        System.out.println(bigInteger4.min(bigInteger5)); // 返回调用者和参数二者的较小值：10
        System.out.println("------------------------------------------");

        // 4.intValue 将BigInteger转换为int类型的整数并返回，注意：超出int范围的数据有误
        BigInteger bigInteger6 = BigInteger.valueOf(123456); // 创建一个不超过int类型的BigInteger对象
        int result1 = bigInteger6.intValue();
        System.out.println(result1); // 没有问题，成功从BigInteger转换为int
        BigInteger bigInteger7 = BigInteger.valueOf(1456465444456456L); // 创建一个超过int类型的BigInteger对象
        int result2 = bigInteger7.intValue();
        System.out.println(result2); // 产生错误，输出-915290104
        // 可以用JDK8之后的新方法intValueExact，如果超过了int类型，会抛出异常，从而在编译阶段就可以发现错误，而不是在运行阶段


    }

}
