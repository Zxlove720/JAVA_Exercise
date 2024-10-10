package JavaExercise120240827;

public class JavaExercise1 {
    public static void main(String[] args) {

        // String API Exercise
        String str = "hello world";

        // 返回字符串长度（包括空白字符）
        int length = str.length();
        System.out.println(length);

        // 将字符串的每一个元素取出，构建一个byte数组（值就是ASCII码）
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.print((char)b);
        }
        System.out.println();

        // 将字符串转换为大写（小写）
        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);

        // 切割子串，包头不包尾
        str = str.substring(0, 5);
    }
}
