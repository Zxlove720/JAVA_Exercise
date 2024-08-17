package TCPExercise120240817;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPExercise1Receive {
    public static void main(String[] args) throws IOException {
        // 服务端
        // 创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(10086);
        // 等待客户端连接
        Socket socket = serverSocket.accept();
        // 创建输入流对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 读取客户端发送的数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
        }
        // 给客户端返回数据
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("服务端已经收到信息");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // 关流
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
