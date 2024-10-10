package JavaExercise20240824;

public class JavaExercise1 {
    public static void main(String[] args) {
        // 需求：
//         给你两个字符串s和t，每个字符串中的字符都不重复，且t是s的一个排列。
//         排列差定义为s和t中每个字符在两个字符串中位置的绝对差值之和
//         返回s和t之间的排列差
        String s = "abcde";
        String t = "edbac";
        System.out.println(solution(s, t));
    }

    // 暴力n²
    public static int solution(String s, String t) {
        char key;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            key = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(j) == key) {
                    count += Math.abs(i - j);
                    break;
                }
            }
        }
        return count;
    }

    // 好看一些的暴力解法
    // 咋一看好像是O(n)的时间复杂度，其实内部indexOf的复杂度是O(n)，所以说复杂度也是n²
    public int findPermutationDifference(String s, String t) {
        char key;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            key = s.charAt(i);
            count += Math.abs(i - t.indexOf(key)) ;
        }
        return count;
    }

    // 字符串中想要根据索引得到元素，charAt方法可以实现
    // 也可以通过toCharArray方法将其转化为一个char数组
}
