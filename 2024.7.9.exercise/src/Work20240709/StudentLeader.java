package Work20240709;

public class StudentLeader extends Student{
    String job;

    public StudentLeader() {}


    public StudentLeader(String name, String gender, int age,
        String nationality, String school, String number, String job) {
        super(name, gender, age, nationality, school, number);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.printf("来自%s学校的%d%s学生%s，学号是%s，职务是%s，正在开会\n", this.school,
                this.age, this.gender, this.name, this.number, this.job);
    }
}
