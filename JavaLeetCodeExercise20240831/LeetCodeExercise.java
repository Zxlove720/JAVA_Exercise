package JavaLeetCodeExercise20240831;

import java.util.Collections;

public class LeetCodeExercise {
    public static void main(String[] args) {
        char[][] grid = {{'B','W','B'},{'B','W','W'},{'B','W','B'}};
        Solution solution = new Solution();
        System.out.println(solution.canMakeSquare(grid));
    }
}
class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (check(grid, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] grid, int row, int col) {
        int count = 0;
        // 这个变量用于统计白色块在3*3矩阵中的4个2*2子矩阵的个数，如果等于2，则不可以；若不是2，则可以
        // 因为当2*2的矩阵中，同一个颜色已经出现两次了，就不可能通过只改变一个块的颜色构造颜色相同的正方形
        // 假如一个颜色出现0次，那么说明已经构成了另外一个颜色的相同正方形
        // 假如一个颜色出现1次，那么说明可以通过改变该颜色，构成另外一个颜色的相同正方形
        // 假如一个颜色出现4次（最多4次），那么已经构成颜色相同的正方形
        for (int i = row; i <= row + 1; i++) {
            for (int j = col; j <= col + 1; j++) {
                if (grid[i][j] == 'W') {
                    count++;
                }
            }
        }
        if (count == 2) {
            return false;
        }
        return true;
    }
}