package School20240709;

public class Student extends Role{
    String classroom;

    public Student() {}

    public Student(String name, String age, String classroom) {
        super(name, age);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void takeLesson() {
        System.out.println("学生" + this.name + "正在听课");
    }
}
