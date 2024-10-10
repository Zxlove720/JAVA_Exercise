package SerializationExercise20240811;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SerializationExercise {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 需求：
        //1. 将存有多个自定义对象的集合序列化操作，保存到list.txt文件中
        //2. 反序列化list.txt，并遍历集合，打印对象信息

        // 创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 21);
        Student s3 = new Student("王五", 22);
        Student s4 = new Student("赵六", 23);
        Student s5 = new Student("钱七", 24);
        // 创建ArrayList集合存储学生对象
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Collections.addAll(studentArrayList, s1, s2, s3, s4, s5);
        // 创建ObjectOutputStream流
        FileOutputStream fos = new FileOutputStream("D:\\Exercise\\StudentArrayList.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 将studentArrayList集合序列化
        oos.writeObject(studentArrayList);
        // 创建ObjectInputStream流
        FileInputStream fis = new FileInputStream("D:\\Exercise\\StudentArrayList.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 将本地的ArrayList字节序列反序列化
        ArrayList<Student> newStudentArrayList = (ArrayList<Student>)ois.readObject();
        // 遍历并打印ArrayList集合
        for (Student s : newStudentArrayList) {
            System.out.println(s);
        }
    }
}
