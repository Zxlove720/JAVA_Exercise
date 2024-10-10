package JavaExercise220240901;

public class JavaExercise2 {
    public static void main(String[] args) {
        // 需求
        // 给你三个正整数num1 ，num2和num3 。
        // 数字num1，num2和num3的数字答案key是一个四位数，定义如下：
        // 一开始，如果有数字少于四位数，给它补前导0 。
        // 答案key的第i个数位（1 <= i <= 4）为 num1 ，num2和num3 第i个数位中的最小值。
        // 请你返回三个数字没有前导0的数字答案。

        int number1 = 1;
        int number2 = 10;
        int number3 = 1000;
        Solution solution = new Solution();
        System.out.println(solution.generateKey(number1, number2, number3));
    }
}

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);

        StringBuilder key = new StringBuilder();
        for(int i = 0; i < 4; i++) {
            key.append((char)(Math.min(Math.min(str1.charAt(i), str2.charAt(i)), str3.charAt(i))));

        }
        String mid = key.toString();
        int result = Integer.parseInt(mid);
        return result;
    }
}
