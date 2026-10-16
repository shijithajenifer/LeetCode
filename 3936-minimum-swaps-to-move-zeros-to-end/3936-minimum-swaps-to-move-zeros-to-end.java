class Solution {
    public int minimumSwaps(int[] nums) {
        int ans = 0;
        int i = 0, j = nums.length - 1;
        
        while (i < j) {
            // Find the first zero from the left
            while (i < j && nums[i] != 0) {
                i++;
            }
            // Find the first non-zero from the right
            while (i < j && nums[j] == 0) {
                j--;
            }
            
            // If pointers haven't crossed, a swap is needed
            if (i < j) {
                ans++;
                i++;
                j--;
            }
        }
        
        return ans;
    }
}