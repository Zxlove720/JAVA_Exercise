package BoxExercise20240720;

public class BoxExercise {
    public static void main(String[] args) {
        // 装箱 从基本数据类型 -> 对应的包装类对象
        // 拆箱 从对应的包装类对象 -> 基本数据类型
        Integer number1 = new Integer(520); // 这就是装箱的过程，已经过时
        Integer number2 = Integer.valueOf(520); // 不必要的装箱

        // Integer中的intValue可以实现从包装类到基本数据类型
        int number3 = number1.intValue(); // 不必要的拆箱
        System.out.println(number3);

        /* 现在是JDK21，由于我们经常要做基本类型与包装类之间的转换，从Java 5（JDK 1.5）开始，
           基本类型与包装类的装箱、拆箱动作可以自动完成。*/

        Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5; /* 等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
                      加法运算完成后，再次装箱，把基本数值转成对象。*/

    }
}
