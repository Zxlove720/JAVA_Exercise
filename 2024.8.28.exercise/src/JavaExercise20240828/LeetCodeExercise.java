package JavaExercise20240828;

public class LeetCodeExercise {
    public static void main(String[] args) {
        // 需求：
//         给你两个长度相等的数组nums1和nums2。
//         数组nums1中的每个元素都与变量x所表示的整数相加。如果x为负数，则表现为元素值的减少。
//         在与x相加后，nums1和nums2相等。当两个数组中包含相同的整数，并且这些整数出现的频次相同时，两个数组相等 。
//         返回整数x。
        int[] array1 = {2,6,4};
        int[] array2 = {9,7,5};
        Solution solution = new Solution();
        int result = solution.addedInteger(array1, array2);
        System.out.println(result);
    }
}

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int x = 0;
        int sum1 = 0;
        int sum2 = 0;
        int len1 = nums1.length;
        for (int number1 : nums1) {
            sum1 += number1;
        }
        for (int number2 : nums2) {
            sum2 += number2;
        }
        if (sum1 < sum2) {
            for (int i = 1;; i++) {
                if (sum1 + (i * len1) == sum2) {
                    return i;
                }
            }
        } else if (sum1 > sum2) {
            for (int i = -1;; i--) {
                if (sum1 + (i * len1) == sum2) {
                    return i;
                }
            }
        } else {
            return 0;
        }
    }
}


