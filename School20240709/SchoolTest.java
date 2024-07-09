package School20240709;
import Employee20240709.AdminStaff;

import java.util.Scanner;
import java.util.ArrayList;
public class SchoolTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Teacher> teachersList = new ArrayList<>();
        System.out.println("请问有多少个学生要录入");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个学生的姓名\n", i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个学生的年龄\n", i + 1);
            String age = sc.next();
            System.out.printf("请输入第%d个学生的班级\n", i + 1);
            String classroom = sc.next();
            Student s = new Student();
            s.setName(name);
            s.setAge(age);
            s.setClassroom(classroom);
            studentsList.add(s);
            System.out.println("第" + (i + 1) + "个学生成功录入");
        }
        System.out.println("请问有多少个老师要录入");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.printf("请输入第%d个老师的姓名\n", i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个老师的年龄\n", i + 1);
            String age = sc.next();
            System.out.printf("请输入第%d个老师的部门\n", i + 1);
            String agency = sc.next();
            Teacher t = new Teacher();
            t.setName(name);
            t.setAge(age);
            t.setAgency(agency);
            teachersList.add(t);
            System.out.println("第" + (i + 1) + "个老师成功录入");
        }
        showStudent(studentsList);
        showTeacher(teachersList);
    }
    public static void showStudent(ArrayList<Student> studentsList) {
        for (int i = 0; i < studentsList.size(); i++) {
            studentsList.get(i).takeLesson();
        }
    }

    public static void showTeacher(ArrayList<Teacher> teachersList) {
        for (int i = 0; i < teachersList.size(); i++) {
            teachersList.get(i).question();
        }
    }

}
