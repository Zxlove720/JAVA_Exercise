package JavaExercise20240825;

import java.util.Scanner;

public class JavaExercise1 {
    public static void main(String[] args) {
        // 需求
        // 你有一个下标从0开始、长度为偶数的整数数组nums，同时还有一个空数组arr。
        // Alice和Bob决定玩一个游戏，游戏中每一轮 Alice 和 Bob 都会各自执行一次操作。游戏规则如下：
        // 每一轮，Alice 先从 nums 中移除一个 最小 元素，然后Bob执行同样的操作。
        // 接着，Bob 会将移除的元素添加到数组 arr 中，然后 Alice 也执行同样的操作。
        // 游戏持续进行，直到 nums 变为空。
        // 返回结果数组 arr
        int[] array = {5, 4, 2, 3};
        int[] returnArray = numberGame(array);
        for (int i : returnArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] numberGame(int[] nums) {
        sort(nums);
        int bob = 1;
        int alice = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = nums[bob];
            i++;
            arr[i] = nums[alice];
            bob += 2;
            alice += 2;
        }
        return arr;
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
