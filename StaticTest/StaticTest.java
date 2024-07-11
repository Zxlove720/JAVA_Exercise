package StaticTest;
import java.util.Scanner;
import java.util.ArrayList;
public class StaticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<Student>();
        System.out.println("请输入学生老师的名字");
        String name = sc.next();
        Student.setTeacher(name);
        System.out.println("要创建多少个学生?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Student s = creatStudent();
            studentsList.add(s);
        }
        showStudent(studentsList);
    }

    public static Student creatStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的名字");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        return new Student(name, age);
    }

    public static void showStudent(ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.printf("学生%s的年龄是%d，老师是%s\n", studentArrayList.get(i).getName(),
                    studentArrayList.get(i).getAge(), Student.getTeacher());
        }

    }
}
