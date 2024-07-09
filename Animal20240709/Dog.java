package Animal20240709;

public class Dog extends Animal{
    public Dog() {}

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String eatThing) {
        System.out.printf("颜色为%s的%d岁狗在吃%s\n", this.color, this.age, eatThing);
    }
}
