package JavaExercise20241016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaExercise {
    public static void main(String[] args) {
        int[] array = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(array));
    }

    public static double minimumAverage(int[] nums){
        int n = nums.length / 2;
        Arrays.sort(nums);
        double average = 0;
        double min = Integer.MAX_VALUE;
        int i;
        int j;
        for (i = 0, j = nums.length - 1; i < n; i++, j--) {
            average = ((nums[i] + nums[j]) / 2.0);
            min = Math.min(average, min);
        }
        return min;
    }

}
