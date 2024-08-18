package LeetcodeExercise220240818;

import java.util.ArrayList;
import java.util.Collections;

public class LeetcodeExercise {
    public static void main(String[] args) {
        // 需求
        //给你一个长度为 n 的整数数组 nums 和一个正整数k
        //一个数组的 能量值 定义为：
        // 如果所有元素都是依次连续且上升的，那么能量值为最大的元素
        // 否则为 -1
        // 你需要求出 nums 中所有长度为 k 的子数组的能量值
        // 请你返回一个长度为 n - k + 1 的整数数组 results ，其中 results[i] 是子数组 nums[i..(i + k - 1)] 的能量值
        int[] array = {1,2,3,4,3,2,5};
        int[] returnArray = resultsArray(array, 3);
        for (int number : returnArray) {
            System.out.print(number + ", ");
        }

    }

    static public int[] resultsArray(int[] nums, int k) {
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

    static public boolean isTrue(ArrayList<Integer> son) {
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
