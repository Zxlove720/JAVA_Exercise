package Animal20240709;

public class Person {
    String name;
    int age;

    public Person() {}

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

    public void keepPet(Dog dog, String something) {
        System.out.printf("%d岁的主人%s在喂%d岁的%s狗吃%s\n", this.age, this.name,
                dog.age, dog.color, something);
    }

    public void keepPet(Cat cat,String something) {
        System.out.printf("%d岁的主人%s在喂%d岁的%s哈基米吃%s\n", this.age, this.name,
                cat.age, cat.color, something);
    }
}
