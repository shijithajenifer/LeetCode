class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLessOrEqual(nums, upper) - countLessOrEqual(nums, lower - 1);
    }

    // Returns the number of pairs (i, j) with i < j such that nums[i] + nums[j] <= val
    private long countLessOrEqual(int[] nums, int val) {
        long count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] <= val) {
                // If nums[left] + nums[right] <= val, then all pairs
                // (left, left+1), (left, left+2), ..., (left, right) are valid.
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}