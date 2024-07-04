package Phone;
import java.util.Scanner;
public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机的品牌");
        String brand = sc.next();
        System.out.println("请输入手机的价格");
        int price = sc.nextInt();
        System.out.println("请输入手机的颜色");
        String color = sc.next();
        Phone phone = new Phone(brand, price, color);
        phone.call(phone);
        phone.sendMessage(phone);
    }
}
