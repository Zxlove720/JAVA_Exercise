package TCPAndUDPExercise20240815;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPAndUDPExercise1Send {
    public static void main(String[] args) throws IOException{
        // 客户端多次发送数据，服务端多次接收数据并打印（假如输入886则关闭）

        // 客户端
        Scanner sc = new Scanner(System.in);
        // 创建流套接字
        Socket socket = new Socket("127.0.0.1", 10086);
        // 创建输出流
        OutputStream outputStream = socket.getOutputStream();
        String message;
        // 循环输入数据
        try {
            while (true) {
                System.out.println("请输入想要发送的内容");
                message = sc.nextLine();
                if (message.equals("886")) {
                    outputStream.write(message.getBytes());
                    break;
                } else {
                    outputStream.write(message.getBytes());
                    outputStream.flush();
                }
            }
        } finally {
            // 最后无论如何都要释放资源
            outputStream.close();
            socket.close();
        }
    }
}
