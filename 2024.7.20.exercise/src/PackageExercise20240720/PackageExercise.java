package PackageExercise20240720;

public class PackageExercise {
    public static void main(String[] args) {
        // 为什么引入包装类?
        /* Java中的核心是面向对象编程，所以很多情况下需要创建对象使用引用数据类型，所以说
           对于基本数据类型，提供了对应的包装类，也就是引用数据类型 */
        // 其中除了int和char以外，其他基本数据类型的包装类都是首字母大写即可，int的包装类是Integer，char的包装类是Character

        Integer number = new Integer(5); // 根据int值创建Integer对象(过时)
        System.out.println(number);
        Integer number2 = new Integer("123"); // 根据String值创建Integer对象(过时)
        System.out.println(number2);
        Integer number3 = Integer.valueOf(520); // 返回表示指定的int值的Integer实例，但是其实是不必要的装箱
        System.out.println(number3);
        Integer number4 = Integer.valueOf("1314"); // 返回保存指定String值的Integer对象，但这里是必要的装箱，必须要用方法调用
        System.out.println(number4);
        String number5 = Integer.toBinaryString(666); // 将int类型的整数转换成String类型的字符串并且返回
        System.out.println(number5);
        int number6 = Integer.parseInt("1314"); // 将字符串类型的整数转成int类型的整数（返回值是int）
        System.out.println(number6);
        // 细节1：用Integer中方法时，参数有字符串的，只能传递数字，不能传递其他任何东西（所以说只有正整数）
        // 细节2：所有包装类，除了Character都有对应的parseXxx的方法，进行类型转换
        String flag = "false";
        boolean b = Boolean.parseBoolean(flag);
        System.out.println(b);


    }
}
