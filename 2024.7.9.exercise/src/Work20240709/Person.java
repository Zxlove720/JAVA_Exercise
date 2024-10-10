package Work20240709;

public class Person {
    String name;
    String gender;
    int age;
    String nationality;

    public Person() {}

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat() {
        System.out.printf("来自%s的%s人%s,%d岁正在吃饭\n", this.nationality, this.gender,
                this.name, this.age);
    }

    public void sleep() {
        System.out.printf("来自%s的%s人%s,%d岁正在睡觉\n", this.nationality, this.gender,
                this.name, this.age);
    }

    public void work() {
        System.out.printf("来自%s的%s人%s,%d岁正在工作\n", this.nationality, this.gender,
                this.name, this.age);
    }
}
