package SetExercise20240725;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExercise {
    public static void main(String[] args) {
        // Comparable是内部的自然排序，Comparator是外部的比较器排序（要new一个新的对象）
        // Comparable比较接口只能实现一种排序的逻辑，而Comparator外部比较器可以灵活的实现多种比较逻辑

        // 创建一个学生类，没有实现Comparable接口
        TreeSet<Student2> studentSet = new TreeSet<>(new Comparator<Student2>() { // 构造TreeSet对象时需要传递Comparator外部比较器对象
            @Override
            public int compare(Student2 o1, Student2 o2) { // 其内部逻辑和Comparable相似
                // 按照年龄升序，若年龄一样则按姓氏排序
                int result = o2.getAge() - o1.getAge();
                result = (result == 0) ? o2.getName().compareTo(o1.getName()) : result;
                return result;
            }
        });
        //创建学生对象
        Student2 s1 = new Student2("zhangSan",28);
        Student2 s2 = new Student2("liSi",27);
        Student2 s3 = new Student2("wangWu",29);
        Student2 s4 = new Student2("zhaoLiu",28);
        Student2 s5 = new Student2("qianQi",30);
        //把学生添加到集合
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        //遍历集合
        for (Student2 student2 : studentSet) {
            System.out.println(student2.toString());
        }

        // Comparable和Comparator的区别
        // 自然排序: 自定义类实现Comparable接口,重写compareTo方法,根据返回值进行排序
        // 比较器排序：比较器排序: 创建TreeSet对象的时候传递Comparator的实现类对象,重写compare方法,根据返回值进行排序

        // 在Set中根据比较规则的存储规则：
        /* 如果返回值为负数，表示当前存入的元素是较小值，存左边
           如果返回值为0，表示当前存入的元素跟集合中元素重复了，不存
           如果返回值为正数，表示当前存入的元素是较大值，存右边 */
    }
}

class Student2 {
    private String name;
    private int age;

    public Student2() {
        this(null, 0);
    }

    public Student2(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}