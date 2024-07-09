package Animal20240709;

public class Cat extends Animal{
    public Cat() {}

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String eatThing) {
        System.out.printf("颜色为%s的%d岁猫在吃%s\n", this.color, this.age, eatThing);
    }
}
