package KeepPets20240710;

public class Person {
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void KeepPets(Animal a, String something) {
        System.out.printf("%d岁的饲养员%s在喂养%d岁的%s%s吃%s\n", this.age, this.name, a.getAge(),
                a.getColor(), (a instanceof Dog? "狗" : "猫") , something);
        if (a instanceof Dog d) {
            d.LookHouse();
        } else if(a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("没这品种");
        }
    }
}
