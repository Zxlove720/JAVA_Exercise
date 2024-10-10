package JavaExercise20240830;

public class JavaExercise {
    public static void main(String[] args) {
        // 需求：
        // 如果数组的每一对相邻元素都是两个奇偶性不同的数字，则该数组被认为是一个特殊数组。
        // 你有一个整数数组nums。如果nums是一个特殊数组，返回true，否则返回false。

        int[] array = {4,3,1,6};
        Solution solution = new Solution();
        System.out.println(solution.isArraySpecial(array));
    }
}

class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (nums[i] % 2 == 0) {
                    if (nums[i - 1] % 2 == 0) {
                        return false;
                    }
                } else {
                    if (nums[i - 1] % 2 == 1) {
                        return false;
                    }
                }
                break;
            }
            if (nums[i] % 2 == 0) {
                if (nums[i + 1] % 2 == 0) {
                    return false;
                }
            } else {
                if (nums[i + 1] % 2 == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
