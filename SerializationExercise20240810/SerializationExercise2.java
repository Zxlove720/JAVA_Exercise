package SerializationExercise20240810;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExercise2 {
    public static void main(String[] args) throws IOException {
        // 反序列化
        // 反序列化，通过反序列化可以将表示对象的字节序列从文件中读取出来，重构对象，对象的数据、类型、存储的数据都是序列化之前的
        // 本地的序列化文件————>（反序列化）字节序列————>对象（内存）

        // ObjectInputStream
        // 通过此类实现反序列化，将本地文件中的Java对象的字节序列反序列化为内存中的对象，实现从本地文件->内存

        // 构造方法
        // ObjectInputStream(InputStream in) 根据InputStream对象创建指定的ObjectInputStream对象
        FileInputStream fis = new FileInputStream("D:\\Exercise\\Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // 假如能够在fis中的路径中成功找到对象的class文件，那么就可以进行反序列化文件，调用ObjectInputStream中的反序列化方法
        // final object readObject() 从fis路径中读取一个字节序列并反序列化为一个对象
        try {
            Student s = (Student)ois.readObject();
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
            fis.close();
        }
        // 对于JVM可以反序列化对象，它必须是能够找到class文件的类
        // 如果找不到该类的class文件，则抛出一个ClassNotFoundException异常
    }
}
