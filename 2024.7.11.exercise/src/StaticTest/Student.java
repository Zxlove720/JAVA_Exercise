package StaticTest;

public class Student {
    private String name;
    private int age;
    private static String teacher;

    public Student(){}

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

    public static String getTeacher() {
        return teacher;
    }

    public static void setTeacher(String teacher) {
        Student.teacher = teacher;
    }

    // 静态方法只能访问静态方法和静态变量
    /*public static void show1() {
        System.out.println(name); // 报错：无法从static上下文引用非static字段"name"
        System.out.printf(teacher); // 用静态变量不报错
        getAge(); // 报错：无法从static上下文引用非static方法"getAge()"
        setTeacher("xl"); // 用静态方法不报错
    }*/

    public void show2() {
        System.out.println(name); // 用非静态变量不报错
        System.out.printf(teacher); // 用静态变量不报错
        int age = this.getAge(); // 用非静态方法不报错
        Student.setTeacher("xl"); // 用静态方法不报错
    }

}
