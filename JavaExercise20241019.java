class Solution {
    public double minimumAverage(int[] nums){
        int n = nums.length / 2;
        Arrays.sort(nums);
        int average = 0;
        ArrayList<Double> arrayList = new ArrayList<>();
        int i;
        int j;
        for (i = 0, j = nums.length - 1; i < n; i++, j--) {
            arrayList.add((nums[i] + nums[j]) / 2.0);
        }
        System.out.println(arrayList);
        return Collections.min(arrayList);
    }
}