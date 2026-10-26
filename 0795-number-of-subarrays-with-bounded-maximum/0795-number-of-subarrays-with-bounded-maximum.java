class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        return count(nums, right) - count(nums, left - 1);
    }

    public int count(int[] nums, int bound) {
        int ans = 0, curr = 0;

        for (int n : nums) {
            if (n <= bound)
                curr++;
            else
                curr = 0;

            ans += curr;
        }

        return ans;
    }
}
