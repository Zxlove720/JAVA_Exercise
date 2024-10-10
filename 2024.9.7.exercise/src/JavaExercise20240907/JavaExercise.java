package JavaExercise20240907;

public class JavaExercise {
    public static void main(String[] args) {
//        System.out.println(Math.round(11.5));
//        System.out.println(Math.round(-11.5));

        int[] array = {1,2,2,1,1,0};
        Solution solution = new Solution();
        int[] result = solution.applyOperations(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] applyOperations(int[] nums) {
        int end = nums.length - 1;
        int n = nums.length;
        for (int i = 0, j = 0; i < n; i++) {
            if (i + 1 != n && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }
}
