package Animal20240712;

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

    public void KeepPets(Animal a) {
        System.out.println("人在喂" + a.getCategory());
        if (a instanceof Dog d) {
            d.swim();
        }
    }
}
