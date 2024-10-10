package StudentArraycopy20240716;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Person{name = " + this.getName() + ", age = " + this.getAge() + "}";
    }
}
