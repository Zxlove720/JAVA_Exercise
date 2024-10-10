package MethodReferenceExercise20240729;

public class MethodReferenceExercise4 {
    public static void main(String[] args) {
        // 引用构造器（引用构造方法）
        // 类名::new

        // 匿名内部类
        useStudentBuilder(new StudentBuilder() {
            @Override
            public Student build(String name, int age) {
                return new Student(name, age);
            }
        });
        // Lambda表达式
        useStudentBuilder((name, age) -> new Student(name, age));
        // 方法引用
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("林青霞", 30);
        System.out.println(s.getName() + "," + s.getAge());
    }
}

class Student{
    private String name;
    private int age;

    public Student() {}

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

interface StudentBuilder {
    Student build(String name,int age);
}
