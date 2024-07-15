package MathExercise20240715;
// Math类所在的是java.lang包，属于核心包，无需导包
public class MathExercise {
    public static void main(String[] args) {
        // Math方法为静态的，不需要创建对象，直接类名调用即可
        // abs 返回参数的绝对值
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));
        // 此方法有多个重载
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(3L));
        System.out.println("--------------------------------------");

        // ceil 返回参数的向上取整的值（向x轴正方向）
        System.out.println(Math.ceil(5.2)); // 因为是向上取整，直接取就好
        System.out.println(Math.ceil(-5.2)); // 向x轴正方向取整
        System.out.println(Math.ceil(14.0));
        System.out.println("--------------------------------------");


        // floor 返回参数的向下取整的值（向x轴负方向）
        System.out.println(Math.floor(5.2));
        System.out.println(Math.floor(-5.2));
        System.out.println("--------------------------------------");


        // round 返回参数四舍五入的值（int）
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.2));
        System.out.println(Math.round(-5.2));
        System.out.println(Math.round(-5.5)); // 这里是保留的-5（负数的话5也是舍）
        System.out.println("--------------------------------------");

        // max和min 返回两个数中的较大值或者较小值（多个重载）
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.min(5.2, 13.14));
        System.out.println(Math.max(5.2, 13.14));
        System.out.println("--------------------------------------");

        // pow 返回参数a的参数b次幂
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.pow(2.5, 4));
        System.out.println(Math.pow(2, 0.5));
        System.out.println(Math.pow(2, -2));
        // 注：虽然指数可以是负数和小数，但不建议这么写，参数b最好是正整数

        System.out.println("--------------------------------------");
        // random 返回一个[0.0,1.0)的随机double值
        System.out.println(Math.random());
        // 可以用和其他方法一起混用
        System.out.println(Math.floor(Math.random() * 100) + 1);
        // 先*100产生0 - 99的小数，再用floor向下取整，然后再加1，就可以产生1 - 100的整数了

    }
}
