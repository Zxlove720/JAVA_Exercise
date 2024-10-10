package TCPExercise120240817;

import java.io.*;
import java.net.Socket;

public class TCPExercise1Send {
    public static void main(String[] args) throws IOException {
        // 需求
        // 客户端：发送数据，接受服务器反馈
        // 服务器：收到消息后给出反馈

        // 案例分析
        // 客户端创建对象，使用输出流输出数据
        // 服务端创建对象，使用输入流接受数据
        // 服务端使用输出流给出反馈数据
        // 客户端使用输入流接受反馈数据

        // 客户端
        // 创建Socket
        Socket socket = new Socket("127.0.0.1", 10086);
        // 创建OutputStream对象
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 客户端输出数据
        bufferedWriter.write("你好，客户端");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // 关闭输出流
        socket.shutdownOutput();
        // 创建InputStream对象接收服务端反馈的数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
        }

        // 此处关流
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();

        // 注：十分重要！！！
        // 客户端发送数据后必须关闭输出流：在客户端发送数据后，应该关闭输出流，这样服务端才能正确读取到数据的结束标志
        // 服务端读取数据时要处理结束标志：服务端在读取数据时，如果客户端没有关闭输出流，readLine() 方法会一直等待，导致程序阻塞
    }
}
