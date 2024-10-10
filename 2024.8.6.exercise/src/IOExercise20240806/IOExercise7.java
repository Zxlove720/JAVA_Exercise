package IOExercise20240806;

import java.io.FileWriter;
import java.io.IOException;

public class IOExercise7 {
    public static void main(String[] args) throws IOException {
        // write(char[] cbuf) 和 write(char[] cbuf, int off, int len)
        FileWriter fw = new FileWriter("D:\\Exercise\\words.txt");
        fw.write("朝花夕拾".toCharArray());
        fw.write("这不好吧".toCharArray(), 0, 2);
        fw.write('啊');
        // write(String str) 和 write(String str, int off, int len)
        fw.write("\n山重水复疑无路，");
        fw.write("\n柳暗花明又一村。", 0, 9); // 换行符和标点符号都算数据 个数
        fw.close();
        // 字符流只能操作文本文件，无法操作图片和视频等非文本文件，所以说单纯读写文本时可以使用字符流，
        // 其他情况使用字节流

    }
}
