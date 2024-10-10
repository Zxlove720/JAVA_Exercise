package SerializationExercise20240810;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExercise1 {
    public static void main(String[] args) throws IOException {
        // 序列化（serialization）
        // Java提供了序列化的机制，用一个字节序列可以表示一个对象，这个字节序列包含了该对象中的数据、对象的类型、对象中存储的属性等信息
        // 字节序列写出到了文件之后，相当于本地文件长久保存了一个对象的信息
        // 对象————>（序列化）字节序列————>保存到本地文件（长久保存）

        // 反序列化，通过反序列化可以将表示对象的字节序列从文件中读取出来，重构对象，对象的数据、类型、存储的数据都是序列化之前的
        // 本地的序列化文件————>（反序列化）字节序列————>对象（内存）

        // ObjectOutputStream
        // 通过此类实现序列化，将Java对象的原始数据类型序列化为字节序列写出文件，实现对象的持久（本地）存储

        // 构造方法
        // ObjectOutputStream(OutputStream out)  通过一个OutputStream创建一个指定的ObjectOutputStream对象
        FileOutputStream fos = new FileOutputStream("D:\\Exercise\\Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 现在得到了ObjectOutputStream的实例对象，可以通过其方法对对象进行序列化

        // final void writeObject(object obj) 将指定的对象序列化
        Student s = new Student("王五", 23, "深圳");
        try{
            oos.writeObject(s);
            System.out.println("Student's data has been saved");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fos.close();
        }
        // 对象序列化之后保存在本地文件中，文件中的字节序列人类是看不懂的，只有通过反序列化才可以阅读
    }
}
