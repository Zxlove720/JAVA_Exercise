package BufferedStremExercise20240807;

import java.io.*;

public class BufferedExercise1 {
    public static void main(String[] args) throws IOException {
        // 将基本的OutputStream和InputStream包装成高级流
        // 缓冲流
        // 也叫高效流（因为有缓冲区，所以说减少了IO交换的次数，所以说更加地高效），
        // 是对于四个File字节（字符）输入（输出）流的加强版本

        // 注：字符流内置了缓冲区，所以说用字符缓冲流的效率提升并不明显

        // 字节缓冲流
        // BufferedInputStream（字节缓冲输入流）  BufferedInputStream（字节缓冲输出流）
        // 内置了默认大小的缓冲区数组，提高效率（通过减少IO次数）

        // BufferedInputStream(InputStream in)
        // 创建一个新的缓冲输入流，需要传递InputStream对象（可以通过多态的方式传递）

        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("D:\\Exercise\\test.mp4"));
        // 传递的是FileInputStream对象，通过多态的方式传递的参数

        // BufferedOutputStream(OutputStream out)
        // 创建一个新的缓冲输出流，其原理和BufferedInputStream一样
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("D:\\Exercise\\copy.mp4"));

        // 缓冲流中的方法和基本流几乎一致，尝试通过复制文件测试其效率：
//        long startTime = System.currentTimeMillis();
//        int b;
//        while ((b = bis1.read()) != -1) {
//            bos1.write(b);
//        }
//        bis1.close();
//        bos1.close();
//        long endTime = System.currentTimeMillis();
//        System.out.println("共用时" + ((endTime - startTime) / 1000) + "秒");
        // 复制一个400mb的视频只需要11s左右，相比于普通的字节流效率显著提高

        // 通过数组的方式传递数据，效率更高
        long startTime = System.currentTimeMillis();
        int len; // 避免读到末尾时重复读取，需要用len变量来记录实际读取到的长度
        byte[] bytes = new byte[1024 * 20]; // 一次读20mb
        while ((len = bis1.read(bytes)) != -1) {
            bos1.write(bytes, 0, len);
        }
        bis1.close();
        bos1.close();
        long endTime = System.currentTimeMillis();
        System.out.println("共用时" + ((endTime - startTime)) + "毫秒"); // 仅需要230ms，效率极高

        // 注：用缓冲流等高级流时，最后关闭资源只需要关闭高级流的资源，无需手动关闭基础流（如File系列），在底层会自动关闭其占用的资源
    }
}
