package Work20240709;

public class Student extends Person{
    String school;
    String number;

    public Student() {}

    public Student(String name, String gender, int age, String nationality, String school, String number) {
        super(name, gender, age, nationality);
        this.school = school;
        this.number = number;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void work() {
        System.out.printf("来自%s学校的%d%s学生%s，学号是%s，正在学习\n", this.school,
                this.age, this.gender, this.name, this.number);
    }

}
