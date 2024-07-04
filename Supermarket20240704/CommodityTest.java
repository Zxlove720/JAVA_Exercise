package Supermarket20240704;
import java.util.Scanner;
public class CommodityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一共有多少种商品");
        int category = sc.nextInt();
        Commodity[] commodityCategory = new Commodity[category];
        for (int i = 0; i < commodityCategory.length; i++) {
            System.out.printf("请输入第%d个商品的名字", i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个商品的价格", i + 1);
            double price = sc.nextDouble();
            System.out.printf("请输入第%d个商品的库存", i + 1);
            int inventory = sc.nextInt();
            Commodity goods = new Commodity(name, price, inventory);
            commodityCategory[i] = goods;
            System.out.printf("第%d个商品成功上架\n", i + 1);
        }
        System.out.printf("\t\t\t\t\t货架\n");
        System.out.printf("\t\t品名\t\t价格\t\t库存\t\t\n");
        for (int i = 0; i < commodityCategory.length; i++) {
            System.out.printf("\t\t%s\t\t%.2f\t\t%d\n", commodityCategory[i].getName(),
                    commodityCategory[i].getPrice(), commodityCategory[i].getInventory());
        }
        double average = calculateAverage(commodityCategory);
        System.out.printf("%d种商品的平均价格是%.2f\n", commodityCategory.length, average);
    }

    public static double calculateAverage(Commodity[] calculateCategory){
        double sum = 0;
        for (int i = 0; i < calculateCategory.length; i++) {
            sum += calculateCategory[i].getPrice();
        }
        return sum / (calculateCategory.length);
    }
}
