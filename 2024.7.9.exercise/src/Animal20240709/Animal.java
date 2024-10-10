package Animal20240709;

public class Animal {
    int age;
    String color;

    public Animal() {}

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String eatThing) {
        System.out.printf("颜色为%s的%d岁动物在吃%s\n", this.color, this.age, eatThing);
    }
}
