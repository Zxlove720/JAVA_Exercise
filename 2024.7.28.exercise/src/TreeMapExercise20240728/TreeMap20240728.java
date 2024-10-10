package TreeMapExercise20240728;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMap20240728 {
    public static void main(String[] args) {
        /* 案例需求
        创建一个TreeMap集合,键是学生对象(Student),值是籍贯(String),学生属性姓名和年龄,按照年龄进行
        排序并遍历。要求按照学生的年龄进行排序,如果年龄相同则按照姓名进行排序 */

        // 创建学生的TreeMap集合，并且使用Comparator比较器
        TreeMap<Student, String> studentTreeMap = new TreeMap<>();

        // 创建学生对象
        Student s1 = new Student("张三", 25);
        Student s2 = new Student("李四", 27);
        Student s3 = new Student("王五", 24);
        Student s4 = new Student("赵六", 30);
        Student s5 = new Student("钱七", 23);
        Student s6 = new Student("张三", 25);

        studentTreeMap.put(s1, "重庆");
        studentTreeMap.put(s2, "四川");
        studentTreeMap.put(s3, "西安");
        studentTreeMap.put(s4, "北京");
        studentTreeMap.put(s5, "上海");
        studentTreeMap.put(s6, "USA");

        System.out.println(studentTreeMap);

        studentTreeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        this("testStudent", 20);
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
    public int compareTo(Student o) {
        int result = this.getAge() - o.getAge();
        result = (result == 0) ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
