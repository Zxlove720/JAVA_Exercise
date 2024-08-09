package IOExercise20240809;

import java.io.*;

public class IOExercise {
    public static void main(String[] args) throws IOException {
        // 文件拷贝
//        File f = new File("D:\\Exercise\\test.mp4");
//        FileReader fr = new FileReader(f);
//        File f2 = new File("D:\\Exercise\\copy.mp4");
//        FileWriter fw = new FileWriter(f2);
//        int result;
//        while ((result = fr.read()) != -1) {
//            fw.write(result);
//        }
//        fw.close();
//        fr.close();

        // 用字符流进行文件拷贝是错误的，只能处理字符流，不能处理二进制文件，所以说要使用字节流对其进行拷贝
        FileInputStream fis = new FileInputStream("D:\\Exercise\\test.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Exercise\\copy.mp4");
        int len;
        byte[] bytes = new byte[1024 * 1024 * 10];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }
}
