package Phone20240714;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        NewPhone np = creatNewPhone();
        OldPhone op = creatOldPhone();
        np.call();
        np.sendMessages();
        np.playGame();
        op.call();
        op.sendMessages();
    }

    public static NewPhone creatNewPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新手机的品牌");
        String brand = sc.next();
        System.out.println("请输入新手机的价格");
        String price = sc.next();
        return new NewPhone(brand, price);
    }
    public static OldPhone creatOldPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入旧手机的品牌");
        String brand = sc.next();
        System.out.println("请输入旧手机的价格");
        String price = sc.next();
        return new OldPhone(brand, price);
    }
}
