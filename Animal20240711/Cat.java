package Animal20240711;

public class Cat extends Animal{
    public Cat() {}

    public Cat(String category, int age) {
        super(category, age);  // 父类的构造方法先行
    }

    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }
}
