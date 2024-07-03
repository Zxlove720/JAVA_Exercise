package demo1;
import java.util.Scanner;
public class CalculateTax20240703 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你税前的工资");
        double salary = sc.nextDouble();
        double pay = salary - (salary * 0.1) - 5000;
        double tax = 0;
        if(pay <= 0){
            System.out.println("不用交税");
        } else if(pay <= 3000){
            tax += pay * 0.03;
        } else if (pay > 3000 && pay <= 12000){
            pay -= 3000;
            tax += 3000 * 0.03 + pay * 0.1;
        } else if (pay > 12000 && pay <= 25000){
            pay -= 12000;
            tax += 3000 * 0.03 + 9000 * 0.1 + pay * 0.2;
        } else if (pay > 25000 && pay <= 35000) {
            pay -= 25000;
            tax += 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + pay * 0.25;
        } else if (pay > 35000 && pay <= 55000) {
            pay -= 35000;
            tax += 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + pay * 0.3;
        } else if (pay > 55000 && pay <= 80000) {
            pay -= 55000;
            tax += 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + pay * 0.35;
        } else if (pay > 80000) {
            pay -= 80000;
            tax += 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 250000 * 0.35 + pay * 0.45;
        }
        System.out.println("交税额为" + tax);
        System.out.println("税后工资是" + ((salary - tax) - (salary * 0.1)));
    }
}
