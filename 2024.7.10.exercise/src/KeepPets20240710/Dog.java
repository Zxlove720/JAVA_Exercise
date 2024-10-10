package KeepPets20240710;

public class Dog extends Animal{
    public Dog() {}

    public Dog(String color, int age) {
        super(color, age);
    }

    public void LookHouse() {
        System.out.println(this.getAge() + "的" + this.getColor() + "狗在看家");
    }
}
