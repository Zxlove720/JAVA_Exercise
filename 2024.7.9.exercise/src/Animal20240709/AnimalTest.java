package Animal20240709;
import java.util.Scanner;
public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入主人的名字");
        String name = sc.next();
        System.out.println("请输入主人的年龄");
        int age = sc.nextInt();
        Person p = new Person(name, age);
        System.out.println("请输入狗的毛色");
        String dogColor = sc.next();
        System.out.println("请输入狗的年龄");
        int dogAge = sc.nextInt();
        Dog d = new Dog(dogAge, dogColor);
        System.out.println("请输入猫的毛色");
        String catColor = sc.next();
        System.out.println("请输入猫的年龄");
        int catAge = sc.nextInt();
        Cat c = new Cat(catAge, catColor);
        p.keepPet(d, "骨头");
        p.keepPet(c, "fish");
        d.eat("骨头");
        c.eat("fish");

    }
}
