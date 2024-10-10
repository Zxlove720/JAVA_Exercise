package Work20240709;
import java.util.Scanner;
import java.util.ArrayList;
public class WorkTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Worker> workersList = new ArrayList<>();
        ArrayList<StudentLeader> studentLeadersList = new ArrayList<>();
        System.out.println("要录入多少个学生?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.printf("请输入第%d个学生的姓名\n" , i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个学生的性别\n" , i + 1);
            String gender = sc.next();
            System.out.printf("请输入第%d个学生的年龄\n" , i + 1);
            int age = sc.nextInt();
            System.out.printf("请输入第%d个学生的国籍\n" , i + 1);
            String nationality = sc.next();
            System.out.printf("请输入第%d个学生的学校\n" , i + 1);
            String school = sc.next();
            System.out.printf("请输入第%d个学生的学号\n" , i + 1);
            String number = sc.next();
            Student s = new Student(name, gender, age, nationality, school, number);
            studentsList.add(s);
        }
        System.out.println("要录入多少个工人?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.printf("请输入第%d个工人的姓名\n" , i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个工人的性别\n" , i + 1);
            String gender = sc.next();
            System.out.printf("请输入第%d个工人的年龄\n" , i + 1);
            int age = sc.nextInt();
            System.out.printf("请输入第%d个工人的国籍\n" , i + 1);
            String nationality = sc.next();
            System.out.printf("请输入第%d个工人的单位\n" , i + 1);
            String unit = sc.next();
            System.out.printf("请输入第%d个工人的工作年限\n" , i + 1);
            int years = sc.nextInt();
            Worker w = new Worker(name, gender, age, nationality, unit, years);
            workersList.add(w);
        }
        System.out.println("要录入多少个学生干部?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.printf("请输入第%d个学生干部的姓名\n" , i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个学生干部的性别\n" , i + 1);
            String gender = sc.next();
            System.out.printf("请输入第%d个学生干部的年龄\n" , i + 1);
            int age = sc.nextInt();
            System.out.printf("请输入第%d个学生干部的国籍\n" , i + 1);
            String nationality = sc.next();
            System.out.printf("请输入第%d个学生干部的学校\n" , i + 1);
            String school = sc.next();
            System.out.printf("请输入第%d个学生干部的学号\n" , i + 1);
            String number = sc.next();
            System.out.printf("请输入第%d个学生干部的植物\n" , i + 1);
            String job = sc.next();
            StudentLeader s = new StudentLeader(name, gender, age, nationality, school, number, job);
            studentLeadersList.add(s);
        }
        show(studentsList, studentLeadersList, workersList);
    }
    public static void show(ArrayList<Student> studentsList,
                            ArrayList<StudentLeader> studentLeaderList,
                            ArrayList<Worker> workersList) {
        for (int i = 0; i < studentsList.size(); i++) {
            studentsList.get(i).work();
            studentsList.get(i).eat();
            studentsList.get(i).sleep();
        }
        for (int i = 0; i < studentLeaderList.size(); i++) {
            studentLeaderList.get(i).work();
            studentLeaderList.get(i).eat();
            studentLeaderList.get(i).sleep();
            studentLeaderList.get(i).meeting();
        }
        for (int i = 0; i < workersList.size(); i++) {
            workersList.get(i).work();
            workersList.get(i).eat();
            workersList.get(i).sleep();
        }
    }
}
