package LeetcodeExercise320240818;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetcodeExercise {
    public static void main(String[] args) {
        // 需求
        //大小为 n x n 的矩阵 grid 中有一条蛇。蛇可以朝 四个可能的方向 移动
        // 矩阵中的每个单元格都使用位置进行标识：grid[i][j] = (i * n) + j
        // 蛇从单元格 0 开始，并遵循一系列命令移动
        // 给你一个整数 n 表示 grid 的大小，另给你一个字符串数组 commands，其中包括 "UP"、"RIGHT"、"DOWN" 和 "LEFT"
        // 题目测评数据保证蛇在整个移动过程中将始终位于 grid 边界内
        // 返回执行 commands 后蛇所停留的最终单元格的位置
        List<String> commands = new LinkedList<>();
        Collections.addAll(commands, "DOWN","RIGHT","UP");
        int result = finalPositionOfSnake(3, commands);
        System.out.println(result);
    }

    static public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] array = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = count;
                count++;
            }
        }
        int x = 0;
        int y = 0;
        for (String command : commands) {
            if (command.equals("UP") && x != 0) {
                x--;
            } else if (command.equals("DOWN") && x != (n - 1)) {
                x++;
            } else if (command.equals("LEFT") && y != 0) {
                y--;
            } else if (command.equals("RIGHT") && y != (n - 1)) {
                y++;
            }
        }
        return array[x][y];
    }
}
