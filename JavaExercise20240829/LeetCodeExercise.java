package JavaExercise20240829;


import java.util.Scanner;

public class LeetCodeExercise {
    public static void main(String[] args) {
        // 需求
        // 给你一个大小为m * n的二维矩阵grid 。你需要判断每一个格子grid[i][j]是否满足：
        //如果它下面的格子存在，那么它需要等于它下面的格子，也就是grid[i][j] == grid[i + 1][j]。
        //如果它右边的格子存在，那么它需要不等于它右边的格子，也就是grid[i][j] != grid[i][j + 1]。
        //如果所有格子都满足以上条件，那么返回true ，否则返回false。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入二维数组的行数：");
        int m = sc.nextInt();
        System.out.println("请输入二维数组的列数：");
        int n =sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("请输入第%d行，第%d列个数字", i + 1, j + 1);
                array[i][j] = sc.nextInt();
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.satisfiesConditions(array));
    }
}

class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int outLength = grid.length;
        int inLength = grid[0].length;
        for (int i = 0; i < outLength; i++){
            for (int j = 0; j < inLength; j++) {
                if (i != outLength - 1  && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
                if (j != inLength - 1 && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
