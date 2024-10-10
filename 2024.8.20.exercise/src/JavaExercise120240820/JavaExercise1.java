package JavaExercise120240820;

public class JavaExercise1 {
    public static void main(String[] args) {
        var age = 18;
        var name = "张三";
        System.out.println(name + ": " + age);
        // 在JDK10之后，对于可以根据赋值确定类型的变量，不需要指定类型，只需要用关键字var

        int money$ = 100; // 标识符可以使用货币符号
        System.out.println(money$);
        int money￥ = 200;
        System.out.println(money￥); // 甚至可以用￥而非$
        int money€ = 300;
        System.out.println(money€); // 甚至可以用€
        // 虽然是不会报错，但是严禁在命名时使用货币符号
    }
}
