package TCPExercise220240817;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPExercise2Receive {
    public static void main(String[] args) throws IOException {
        // 服务端
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("服务端已经收到");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();
        // 关闭资源
        bufferedReader.close();
        socket.close();
        serverSocket.close();

    }
}
