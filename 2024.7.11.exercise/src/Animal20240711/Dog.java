package Animal20240711;

public class Dog extends Animal implements Swim{
    public Dog() {}

    public Dog(String category, int age) {
        super(category, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃肉");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
