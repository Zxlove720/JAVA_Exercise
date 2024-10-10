package LeetcodeExercise120240818;

public class LeetcodeExercise {
    public static void main(String[] args) {
        // 需求
        //给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符
        //'A'：Absent，缺勤
        //'L'：Late，迟到
        //'P'：Present，到场
        //如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
        //按 总出勤 计，学生缺勤（'A'）严格 少于两天
        //学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录
        //如果学生可以获得出勤奖励，返回 true ；否则，返回 false
        String work = "PPPPALLP";
        boolean flag = checkRecord(work);
        if (flag) {
            System.out.println("可以得到出勤奖励");
        } else {
            System.out.println("不能得到出勤奖励");
        }
    }

    // 纯暴力解法
    static public boolean checkRecord(String s) {
        int count = 0;
        int late = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A') {
                count++;
            } else if (array[i] == 'L'){
                late++;
            }
            if (count == 2) {
                return false;
            }
            if (late == 3) {
                return false;
            }
            if (i != array.length - 1) {
                if (array[i] == 'L' && array[i + 1] != 'L') {
                    late = 0;
                }
            }
        }
        return true;
    }
}
