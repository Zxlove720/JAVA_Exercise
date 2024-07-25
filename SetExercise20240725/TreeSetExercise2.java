package SetExercise20240725;
import java.util.TreeSet;
public class TreeSetExercise2 {
    public static void main(String[] args) {
        // 自然排序Comparable的使用
        /* 案例需求:
        存储学生对象并遍历，创建TreeSet集合使用无参构造方法
        要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序 */

        // Comparable是一个可以用来比较的接口，要在Student类中实现这个接口
        // 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();
        //创建学生对象
        Student s1 = new Student("zhangSan",28);
        Student s2 = new Student("liSi",27);
        Student s3 = new Student("wangWu",29);
        Student s4 = new Student("zhaoLiu",28);
        Student s5 = new Student("qianQi",30);
        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //遍历集合
        for (Student student : ts) {
            System.out.println(student.toString());
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        this(null, 0);
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        // 按照年龄大小进行比较
        int result = s.age - this.getAge();
        result = result == 0 ? this.name.compareTo(s.getName()) : result;
        return result;
    }
}