package TCPExercise20240815;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSendExercise {
    public static void main(String[] args) throws IOException {
        // TCP发送端（客户端）
        // 创建流套接字
        Socket socket = new Socket("127.0.0.1", 10086);
        // 创建输出流
        OutputStream outputStream = socket.getOutputStream();
        // 写出数据
        outputStream.write("你好 TCP".getBytes());
        // 释放资源
        // 注：Socket和OutputStream对象都需要关闭
        outputStream.close();
        socket.close();
    }
}
