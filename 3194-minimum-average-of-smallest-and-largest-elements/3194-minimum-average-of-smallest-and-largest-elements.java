class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        double ans = Double.MAX_VALUE;
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            ans = Math.min(ans, (nums[i] + nums[n - 1 - i]) / 2.0);
        }

        return ans;
    }
}
