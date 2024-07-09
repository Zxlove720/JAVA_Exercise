package Phone20240709;
import java.util.Scanner;
import java.util.ArrayList;
public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> phonesList = new ArrayList<>();
        System.out.println("要录入多少手机?");
        Phone.setSize(6);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d类手机品牌\n", i + 1);
            String brand = sc.next();
            System.out.printf("请输入第%d类手机的价格\n", i + 1);
            String price = sc.next();
            Phone p = new Phone();
            p.setBrand(brand);
            p.setPrice(price);
            phonesList.add(p);
            System.out.println(brand + "手机成功录入");
        }
        showWays(phonesList);
    }

    public static void showWays(ArrayList<Phone> phonesList){
        for (int i = 0; i < phonesList.size(); i++) {
            phonesList.get(i).call();
            phonesList.get(i).sendMessages();
            phonesList.get(i).playGames();
        }
    }

}
