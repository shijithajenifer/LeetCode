class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        int i = nums.length - 2;

        // 1. Find first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i < 0) return -1;  // digits are in descending order

        // 2. Find the smallest number greater than nums[i] to swap
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        swap(nums, i, j);

        // 3. Reverse the subarray after i
        reverse(nums, i + 1, nums.length - 1);

        try {
            return Integer.parseInt(new String(nums));
        } catch (NumberFormatException e) {
            return -1;  // overflow
        }
    }

    private void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
