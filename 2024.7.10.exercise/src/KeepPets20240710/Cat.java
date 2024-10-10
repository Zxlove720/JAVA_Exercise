package KeepPets20240710;

public class Cat extends Animal{
    public Cat() {}

    public Cat(String color, int age) {
        super(color, age);
    }

    public void catchMouse() {
        System.out.println(this.getAge() + "的" + this.getColor() + "猫在抓老鼠");
    }
}
