package StudentSystemPro20240708;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("请输入你的用户名");
                    String userName = sc.next();
                    if (checkUserName(users, userName)) {
                        if (login(users, userName)) {
                        StudentSystem.studentSystem();
                        }
                    } else {
                        System.out.println("未注册的用户名!");
                    }
                }
                case 2 -> enroll(users);
                case 3 -> findPassword(users);
                case 0 -> {
                    System.out.println("登录界面退出");
                    System.exit(0);
                }
                default -> System.out.println("选择错误,请重新选择");
            }
        }
    }

    public static void menu() {
        System.out.println("\t\t\t\t请先登录/注册然后使用");
        System.out.println("\t\t\t\t    1.登录账号");
        System.out.println("\t\t\t\t    2.注册账号");
        System.out.println("\t\t\t\t    3.忘记密码");
        System.out.println("\t\t\t\t    0.直接退出");
        System.out.println("请选择你要进行的操作-->");
    }

    public static boolean checkUserName(ArrayList<User> users, String userName){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
               return true;
            }
        }
        return false;
    }

    public static boolean login (ArrayList<User> users, String userName) {
        Scanner sc = new Scanner(System.in);
        int place = findPlace(users, userName);
        int count = 0;
        while(count < 3) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请输入验证码");
            String newCaptcha = creatCaptcha();
            System.out.printf("验证码是%s\n", newCaptcha);
            String captcha = sc.next();
            if (users.get(place).getPassword().equals(password) && captcha.equalsIgnoreCase(newCaptcha)) {
                System.out.printf("欢迎用户:%s\n", userName);
                return true;
            } else {
                System.out.printf("密码(验证码)错误!你还剩%d次机会\n", 2 - count);
            }
            count++;
        }
        return false;
    }

    public static int findPlace(ArrayList<User> users, String userName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public static void enroll(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎注册系统");
        System.out.println("请输入你的用户名");
        String userName = sc.nextLine();
        System.out.println("请输入密码");
        String rightPassword = sc.nextLine();
        System.out.println("请再输一次密码");
        String password = sc.nextLine();
        System.out.println("请输入验证码");
        String newCaptcha = creatCaptcha();
        System.out.printf("验证码是%s\n", newCaptcha);
        String captcha = sc.next();
        if (rightPassword.equals(password) && captcha.equalsIgnoreCase(newCaptcha)) {
            User user = new User();
            user.setUserName(userName);
            user.setPassword(rightPassword);
            System.out.printf("恭喜用户%s创建成功\n", userName);
            System.out.println("请输入你的手机号码以便找回密码");
            String phoneNumber = sc.next();
            user.setPhoneNumber(phoneNumber);
            users.add(user);
        } else {
            System.out.println("两次密码不一致,请重新输入(或者验证码错误)");
        }
    }

    public static void findPassword(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String userName = sc.next();
        if (checkUserName(users, userName)) {
            int place = findPlace(users, userName);
            System.out.println("请输入你的密保手机号");
            String phoneNumber = sc.next();
            if (users.get(place).getPhoneNumber().equals(phoneNumber)) {
                System.out.println("请输入验证码");
                String newCaptcha = creatCaptcha();
                System.out.printf("验证码:%s\n", newCaptcha);
                String captcha = sc.next();
                if (captcha.equalsIgnoreCase(newCaptcha)) {
                    System.out.println("请重新输入你的密码");
                    String password = sc.next();
                    System.out.println("请再次输入确认");
                    String password2 = sc.next();
                    if (password.equals(password2)) {
                         User user = new User(userName, password, phoneNumber);
                         users.set(place, user);
                        System.out.printf("用户%s修改密码成功，请重新登录\n", userName);
                    } else {
                        System.out.println("两次输入的密码不同");
                    }
                } else {
                    System.out.println("验证码错误");
                }
            } else {
                System.out.println("无效的密保手机号");
            }

        } else {
            System.out.println("未注册的用户名");
        }
    }

    public static String creatCaptcha() {
        char[] words = makeWords();
        char[] numbers = makeNumbers();
        char[] captcha = makeCaptcha(words, numbers);
        randomCaptcha(captcha);
        return new String(captcha);
    }

    public static char[] makeWords(){
        char[] words = new char[52];
        for (int i = 0; i < words.length; i++) {
            if (i <= 25) {
                words[i] = (char) (65 + i);
            } else {
                words[i] = (char) (97 + i - 26);
            }
        }
        return words;
    }

    public static char[] makeNumbers(){
        char[] numbers = new char[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (char)(i + 48);
        }
        return numbers;
    }

    public static char[] makeCaptcha(char[] words, char[] numbers){
        Random r = new Random();
        char[] captcha = new char[5];
        int randomNumber;
        for (int i = 0; i < 4; i++) {
            randomNumber = r.nextInt(words.length);
            captcha[i] = words[randomNumber];
        }
        randomNumber = r.nextInt(numbers.length);
        captcha[4] = numbers[randomNumber];
        return captcha;
    }

    public static void randomCaptcha(char[] captcha){
        Random r = new Random();
        int randomNumber;
        char temp;
        for (int i = captcha.length - 1; i >= 0; i--) {
            randomNumber = r.nextInt(i + 1);
            temp = captcha[randomNumber];
            captcha[randomNumber] = captcha[i];
            captcha[i] = temp;
        }
    }

}
