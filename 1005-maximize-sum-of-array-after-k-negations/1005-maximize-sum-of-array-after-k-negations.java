class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {


        // Sort the array
        Arrays.sort(nums);

        // Convert negative numbers to positive
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // Calculate current sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If remaining k is odd, flip the smallest element
        if (k % 2 == 1) {
            int min = nums[0];

            for (int num : nums) {
                min = Math.min(min, num);
            }

            sum -= 2 * min;
        }

        return sum;
    }
} 
