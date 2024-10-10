package HashMapExercise20240724;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class HashMapExercise4 {
    public static void main(String[] args) {
        /* 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象 */

        // 创建学生集合
        HashMap<Student, String> hashMap = new HashMap<>();
        // 创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 21);
        Student s3 = new Student("王五", 22);
        Student s4 = new Student("王五", 22);
        // 将学生加入到集合中
        hashMap.put(s1, "重庆");
        hashMap.put(s2, "四川");
        hashMap.put(s3, "北京");
        hashMap.put(s4, "上海");
        // 遍历集合
        Set<Student> keySet = hashMap.keySet();
        for (Student key : keySet) {
            String value = hashMap.get(key);
            System.out.println(key.toString() + " : " + value);
        }
    }
}



class Student{
    String name;
    int age;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}