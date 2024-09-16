package JavaLeetCodeExercise20240916;

public class LeetCodeExercise {
    public static void main(String[] args) {
        int[] distance = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.distanceBetweenBusStops(distance, 0, 3));
    }
}

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int minDistance = 0;
        int sumDistance = 0;
        int ADistance = 0;
        int length = distance.length;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            sumDistance += distance[start];
            if (start == destination) {
                flag = false;
            }
            if (flag) {
                ADistance += distance[start];
            }
            start = (start + 1) % length; // 循环队列经典写法
        }
        int anonterDistance = sumDistance - ADistance;
        return ADistance < anonterDistance ? ADistance : anonterDistance;
    }
}
