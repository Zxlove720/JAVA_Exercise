package JavaExercise20241002;

public class JavaExercise {
    public static void main(String[] args) {
        int[][] array = {{1,3},{2,3},{3,1}};
        Solution solution = new Solution();
        System.out.println(solution.findJudge(3, array));
    }
}

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] out = new int[n + 1];
        int[] in = new int[n + 1];

        for (int[] edges : trust) {
            int x = edges[0];
            int y = edges[1];
            out[x]++;
            in[y]++;
        }

        for (int i = 1; i <= n; i++) {
            if (out[i] == 0 && in[i] == (n - 1)) {
                return i;
            }
        }
        return -1;
    }
}