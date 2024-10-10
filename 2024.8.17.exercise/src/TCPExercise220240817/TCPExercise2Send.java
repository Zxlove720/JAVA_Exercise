package TCPExercise220240817;

import java.io.*;
import java.net.Socket;

public class TCPExercise2Send {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 客户端：数据来自于本地文件，接收服务器反馈
        // 服务器：接收到的数据写入本地文件，给出反馈

        // 分析：
        // 创建客户端对象，创建输入流对象指向文件，每读一次数据就给服务器输出一次数据，输出结束后
        // 使用shutdownOutput()方法告知服务端传输结束

        // 创建服务器对象，创建输出流对象指向文件，每接受一次数据就使用输出流输出到文件中，传输结束后
        // 使用输出流给客户端反馈信息

        // 客户端接受服务端的回馈信息

        // 客户端
        // 创建Socket对象
        Socket socket = new Socket("127.0.0.1", 10086);
        // 从本地文件读入数据并发送到服务端
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader("D:\\Exercise\\words.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 开始发送
        String lineFile;
        while ((lineFile = bufferedReaderFile.readLine()) != null) {
            bufferedWriter.write(lineFile);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        // 关闭输出流
        socket.shutdownOutput();
        // 接收服务端的返回
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
        }
        // 关闭输入流
        socket.shutdownInput();
        // 关闭所有流
        bufferedReaderFile.close();
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
