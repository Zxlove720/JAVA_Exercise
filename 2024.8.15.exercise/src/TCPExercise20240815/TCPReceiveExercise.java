package TCPExercise20240815;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiveExercise {
    public static void main(String[] args) throws IOException {
        // TCP接收端（服务端）
        // 创建接收端的Socket对象ServerSocket
        ServerSocket serverSocket = new ServerSocket(10086);
        // 等待客户端的连接
        Socket socket = serverSocket.accept();
        // 从连接通道中获取流读取的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes,0, len));
        }
        // 关闭资源
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
