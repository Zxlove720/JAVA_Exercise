package ClassReflect20240831;

public class ReflectExercise1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射：
        // 在运行状态中，对于任意一个类，都可以知道该类的所有属性和方法
        // 对于任意一个对象，都能够调用其任意属性和方法
        // 这种动态获取信息以及动态调用对象方法的功能就是Java的反射机制
        // 通过反射创建对象可以无视权限修饰符而调用类中的内容

        // 反射都是从class字节码文件中获取的内容

        // 1.最常用：Class类中的静态方法  forName(全类名)   全类名：包名 + 类名
        // 2.类名 + .class
        // 3.对象中的方法：getClass()   该方法需要实例化对象

        // 因为class字节码文件在硬盘中是唯一的，所以说三种方法获得的class对象是同一个

        Class<?> class1 = Class.forName("ClassReflect20240831.Student");
        // 会抛出异常：ClassNotFoundException

        Class<?> class2 = Student.class;

        Student student = new Student();
        Class<?> class3 = student.getClass();

        System.out.println(class1 == class2 && class2 == class3);

        // Java文件：自己编写的Java代码
        // class字节码文件：Java文件经过编译之后，产生的class文件，是存储在硬盘中的，也是JVM虚拟机实际运行的文件
        // class字节码文件对象：当class文件加载进入内存之后，JVM自动创建出来的对象，至少包含：类的构造方法，成员变量，成员方法

        // 反射获取的就是class字节码文件对象，这个对象在内存中是唯一的，所以说无论用什么方法获取的都是同一个对象
    }
}
