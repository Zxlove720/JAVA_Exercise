package ReflectExercise120240820;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectExercise1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        //1.获取整体的字节码文件对象
//        Class clazz = Class.forName("com.itheima.a02reflectdemo1.Student");
//        //2.获取空参的构造方法
//        Constructor con = clazz.getConstructor();
//        //3.利用空参构造方法创建对象
//        Student stu = (Student) con.newInstance();
//        System.out.println(stu);
//
//
//        System.out.println("=============================================");

        //需求2：
        //获取带参构造，并创建对象
        //1.获取整体的字节码文件对象
        Class clazz = Class.forName("com.itheima.a02reflectdemo1.Student");
        //2.获取有参构造方法
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
        //3.临时修改构造方法的访问权限（暴力反射）
        con.setAccessible(true);
        //4.直接创建对象
        Student stu = (Student) con.newInstance("zhangsan", 23);
        System.out.println(stu);
    }
}
