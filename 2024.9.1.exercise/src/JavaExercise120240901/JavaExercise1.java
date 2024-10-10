package JavaExercise120240901;

public class JavaExercise1 {
    public static void main(String[] args) {
        // 需求：
        // 给你两个整数数组 startTime（开始时间）和 endTime（结束时间），并指定一个整数 queryTime 作为查询时间。
        // 已知，第i名学生在startTime[i]时开始写作业并于 endTime[i] 时完成作业。
        // 请返回在查询时间queryTime时正在做作业的学生人数。形式上，
        // 返回能够使queryTime处于区间[startTime[i], endTime[i]]（含）的学生人数。

        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;

        Solution solution = new Solution();
        System.out.println(solution.busyStudent(startTime, endTime, queryTime));
    }
}

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
