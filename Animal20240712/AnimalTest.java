package Animal20240712;
import java.util.Scanner;
public class AnimalTest {
    public static void main(String[] args) {
        Dog d = creatDog();
        Cat c = creatCat();
        d.eat();
        d.swim();
        c.eat();
        Person p = new Person("张三", 20);
        p.KeepPets(d);
        p.KeepPets(c);
    }

    public static Dog creatDog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入狗的种类");
        String category = sc.next();
        System.out.println("请输入狗的年龄");
        int age = sc.nextInt();
        return new Dog(category, age);
    }
    public static Cat creatCat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猫的种类");
        String category = sc.next();
        System.out.println("请输入猫的年龄");
        int age = sc.nextInt();
        return new Cat(category, age);
    }
}
