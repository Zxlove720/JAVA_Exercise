package JavaExercise20240908;

import java.util.Arrays;
import java.util.Collections;

public class LeetCodeExercise {
    public static void main(String[] args) {
        int[] array = {-4,-1,0,3,10};
        Solution solution = new Solution();
        int[] result = solution.sortedSquares(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    /*public void sort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }*/
}
