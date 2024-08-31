package ClassReflect20240831;

public class Student {
    private String name;
    private String gender;
    public int age;

    public Student() {}

    private Student(String name){
        this.name = name;
    }

    private Student(int age){
        this.age = age;
    }

    private Student(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food) {
        System.out.println("学生" + this.name + "正在吃" + food);
    }

    private void study() {
        System.out.println("学生" + this.name + "正在学习");
    }

}
