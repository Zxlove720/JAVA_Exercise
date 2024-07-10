package KeepPets20240710;
import java.util.Scanner;
public class KeepPetsTest {
    public static void main(String[] args) {
        Person p = creatPerson();
        Animal aDog = creatDog();
        Animal aCat = creatCat();
        p.KeepPets(aDog, "骨头");
        p.KeepPets(aCat, "🐟");

    }

    public static Person creatPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入饲养员的姓名");
        String name = sc.next();
        System.out.println("请输入饲养员的年龄");
        int age = sc.nextInt();
        return new Person(name, age);
    }

    public static Dog creatDog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入狗的姓名");
        String name = sc.next();
        System.out.println("请输入狗的年龄");
        int age = sc.nextInt();
        return new Dog(name, age);
    }

    public static Cat creatCat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猫的姓名");
        String name = sc.next();
        System.out.println("请输入猫的年龄");
        int age = sc.nextInt();
        return new Cat(name, age);
    }
}
