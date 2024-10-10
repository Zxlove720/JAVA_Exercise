package StudentManage20240704;
import java.util.Scanner;
public class StudentManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问有多少个学生?");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            System.out.printf("请输入第%d个学生的姓名", i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个学生的ID", i + 1);
            int ID = sc.nextInt();
            System.out.printf("请输入第%d个学生的年龄", i + 1);
            int age = sc.nextInt();
            Student student = new Student(ID, name, age);
            students[i] = student;
            System.out.println();
        }
        showStudent(students);
        students = appendStudent(students);
        showStudent(students);
        deleteStudent(students);
        showStudent(students);
    }
    public static void showStudent(Student[] students){
        System.out.println("\t\t\t学生信息");
        System.out.println("\t\tID      姓名\t\t年龄");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("\t\t%d      %s\t\t%d\n", students[i].getID(), students[i].getName(),
                    students[i].getAge());
        }
    }

    public static int countStudents(Student[] students){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean isEmpty(Student[] students){
        int count = countStudents(students);
        if(count >= (students.length - 1)){
            return true;
        }
        return false;
    }

    public static Student[] appendStudent(Student[] students){
        int count = countStudents(students);
        Student[] newStudents = new Student[count + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的ID");
        int ID = sc.nextInt();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        Student student = new Student(ID,name,age);
        newStudents[count] = student;
        return newStudents;
    }

    public static int findPosition(Student[] students, int keyID){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getID() == keyID){
                return i;
            }
        }
        return -1;
    }

    public static void deleteStudent(Student[] students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的ID");
        int keyID = sc.nextInt();
        int position = findPosition(students, keyID);
        students[position] = null;
    }
}
