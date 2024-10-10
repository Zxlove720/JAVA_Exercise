package area20240711;
import java.util.Scanner;
public class AreaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 创建一个矩形
        Rectangle rtg = creatRectangle();
        System.out.println("长为" + rtg.getLength() + "宽为" + rtg.getWidth()
        + "的矩形的周长是" + rtg.length());
        System.out.println("长为" + rtg.getLength() + "宽为" + rtg.getWidth()
        + "的矩形的面积是" + rtg.area());

        // 创建一个圆形
        Circle c = creatCircle();
        System.out.println("半径为" + c.getR() + "圆的周长是" + c.length());
        System.out.println("半径为" + c.getR() + "圆的面积是" + c.area());


    }

    public static Rectangle creatRectangle () {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入矩形的长");
        double length = sc.nextDouble();
        System.out.println("请输入矩形的宽");
        double width = sc.nextDouble();
        return new Rectangle(length, width);
    }

    public static Circle creatCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆形的半径");
        double r = sc.nextDouble();
        return new Circle(r);
    }
}
