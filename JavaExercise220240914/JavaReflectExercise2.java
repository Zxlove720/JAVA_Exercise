package JavaExercise220240914;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JavaReflectExercise2 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {

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
//

        //测试类中的代码：
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
class Student{
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
