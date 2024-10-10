package TCPAndUDPExercise20240815;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPAndUDPExercise1Receive {
    public static void main(String[] args) throws IOException {
        // 接收端（客户端）
        // 创建服务端流套接字
        ServerSocket serverSocket = new ServerSocket(10086);
        // 创建流套接字
        Socket socket = serverSocket.accept();
        // 循环读取
        InputStream inputStream = socket.getInputStream();
        int len;
        byte[] bytes = new byte[10];
        String message = "";
        try {
            while (true) {
//                while ((len = inputStream.read(bytes)) != -1) {
//                    // 这种写法大错，这种写法只会在返回值是-1才会出循环进行判断，相当于必须要等客户端全部发送完毕才会进行判断，
//                    // 换句话说，用这种写法只能输出“886”
//                    message = new String(bytes, 0, len);
//                }
//                if (message.equals("886")) {
//                    System.out.println("用户1：" + message);
//                    break;
//                } else {
//                    System.out.println("用户1：" + message);
//                }
                if ((len = inputStream.read(bytes)) != -1) {
                    message = new String(bytes, 0, len);
                }
                if (message.equals("886")) {
                    System.out.println("用户1：" + message);
                    break;
                } else {
                    System.out.println("用户1：" + message);
                }
            }
//            while (true) {
//                len = inputStream.read(bytes);
//                if (len != -1) {
//                    String message = new String(bytes, 0, len);
//                    System.out.println("用户1：" + message);
//                    if (message.equals("886")) {
//                        break;
//                    }
//                }
//            }
        } finally {
            // 释放资源
            inputStream.close();
            socket.close();
            serverSocket.close();
        }
    }
}
