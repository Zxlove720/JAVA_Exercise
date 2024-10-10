package StudentsSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class MainSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addStudent(studentList);
                case 2 -> printStudents(studentList);
                case 3 -> deleteStudents(studentList);
                case 4 -> replaceStudents(studentList);
                case 5 -> checkStudents(studentList);
                case 0 -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("选择错误，请重新选择");
            }
        }
    }


    public static void menu() {
        System.out.println("\t\t\t\t欢迎使用学生管理系统");
        System.out.println("\t\t\t\t    1.添加学生");
        System.out.println("\t\t\t\t    2.输出学生");
        System.out.println("\t\t\t\t    3.删除学生");
        System.out.println("\t\t\t\t    4.修改学生");
        System.out.println("\t\t\t\t    5.查询学生");
        System.out.println("\t\t\t\t    0.退出系统");
        System.out.println("请选择要进行的操作-->");
    }

    public static void addStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加多少个学生?");
        int n = sc.nextInt();
        String id;
        String name;
        int age;
        String address;
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个学生的id", (studentList.size() + 1));
            id = sc.next();
            if (checkId(id, studentList)) {
                System.out.println("id合法");
            } else {
                System.out.println("id输入不合法，添加失败");
                continue;
            }
            System.out.printf("请输入第%d个学生的姓名", (studentList.size() + 1));
            name = sc.next();
            System.out.printf("请输入第%d个学生的年龄", (studentList.size() + 1));
            age = sc.nextInt();
            System.out.printf("请输入第%d个学生的地址", (studentList.size() + 1));
            address = sc.next();
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            studentList.add(s);
            System.out.printf("第%d个学生添加成功\n", (studentList.size() + 1));
        }
    }

    public static boolean checkId(String id, ArrayList<Student> studentArrayList) {
        if (id.length() != 6) {
           return false;
        }
        if (id.charAt(0) >= '0' && id.charAt(0) <= '9') {
            return false;
        }
        for (int i = 0; i < studentArrayList.size(); i++) {
            if(studentArrayList.get(i).getId().equals(id))
                return false;
        }
        return true;
    }

    public static void printStudents(ArrayList<Student> studentArrayList) {
        System.out.println("\t\t\t\t学生信息为");
        System.out.println("id\t\t\t姓名\t\t年龄\t家庭地址");
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.printf("%s\t\t%s\t\t\t%d\t\t%s\n", studentArrayList.get(i).getId(),
                                                          studentArrayList.get(i).getName(),
                                                          studentArrayList.get(i).getAge(),
                                                          studentArrayList.get(i).getAddress());
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void replaceStudents(ArrayList<Student> studentArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改学生的id");
        String id = sc.next();
        int index = findIndex(studentArrayList, id);
        if (index == -1) {
            System.out.println("找不到该id");
        } else {
            System.out.println("请输入更新后的学生id");
            id = sc.next();
            if (checkId(id, studentArrayList)) {
                System.out.println("id合法");
            } else {
                System.out.println("id输入不合法,请重新输入");
                return;
            }
            System.out.println("请输入更新后的学生姓名");
            String name = sc.next();
            System.out.println("请输入更新后的学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入更新后的学生地址");
            String address = sc.next();
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            studentArrayList.set(index, s);
            System.out.println("修改成功");
        }
    }

    public static int findIndex(ArrayList<Student> studentArrayList, String id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteStudents(ArrayList<Student> studentArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除学生的id");
        String id = sc.next();
        int index = findIndex(studentArrayList, id);
        if (index == -1) {
            System.out.println("找不到该id");
        } else {
            studentArrayList.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void checkStudents(ArrayList<Student> studentArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要查询的学生id");
        String id = sc.next();
        int index = findIndex(studentArrayList, id);
        if (index == -1) {
            System.out.println("找不到该id");
        } else {
            System.out.println("\t\t\t\t学生信息为");
            System.out.println("id\t\t\t姓名\t\t年龄\t家庭地址");
                System.out.printf("%s\t\t%s\t\t\t%d\t\t%s\n", studentArrayList.get(index).getId(),
                        studentArrayList.get(index).getName(),
                        studentArrayList.get(index).getAge(),
                        studentArrayList.get(index).getAddress());
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
