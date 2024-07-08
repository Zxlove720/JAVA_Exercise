package TeacherSystem20240708;
import java.util.Scanner;
import java.util.ArrayList;
public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
        System.out.println("要录入几个老师?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个老师的姓名\n", i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个老师的专业\n", i + 1);
            String skill = sc.next();
            Teacher teacher = new Teacher();
            teacher.setName(name);
            teacher.setSkill(skill);
            teachers.add(teacher);
            System.out.printf("%s老师信息录入成功\n", name);
        }
        printTeacher(teachers);
    }

    public static void printTeacher(ArrayList<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("姓名：" + teachers.get(i).getName() +
                    ", 专业：" + teachers.get(i).getSkill());
        }
    }
}
