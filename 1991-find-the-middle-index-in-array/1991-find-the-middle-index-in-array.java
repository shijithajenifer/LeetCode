class Solution {
    public int findMiddleIndex(int[] nums) {

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Right sum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the leftmost middle index
            }
            leftSum += nums[i];
        }
        
        return -1; // No middle index found
    }
}
