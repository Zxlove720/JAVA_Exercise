package JavaExercise20241006;

import java.util.ArrayList;
import java.util.Collections;

public class JavaExercise {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5};
        Solution solution = new Solution();
        int[] array = solution.resultsArray(nums, 3);
        for (int i : array) {
            System.out.println(i);
        }
    }
}


class Solution {
    public int[] resultsArray(int[] nums, int k) {
        // 找子数组
        ArrayList<Integer> returnList = new ArrayList<>();
        int start = 0;
        while (start + k <= nums.length) {
            ArrayList<Integer> son = new ArrayList<>();
            for(int i = start; i < k + start; i++) {
                son.add(nums[i]);
            }
            if (isTrue(son)) {
                returnList.add(Collections.max(son));
            } else {
                returnList.add(-1);
            }
            start++;
        }
        int[] returnArray = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            returnArray[i] = returnList.get(i);
        }
        return returnArray;
    }

    public boolean isTrue(ArrayList<Integer> son) {
        if (son.size() <= 1) {
            return true;
        }
        for (int i = 0; i < son.size(); i++) {
            if (i == son.size() - 1) {
                break;
            }
            if ((son.get(i) > son.get(i + 1)) || ((son.get(i + 1) - son.get(i)) != 1)) {
                return false;
            }
        }
        return true;
    }
}