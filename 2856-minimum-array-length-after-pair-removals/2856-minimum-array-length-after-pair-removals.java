class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {

        int n = nums.size();
        int max = 1, count = 1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i).equals(nums.get(i - 1)))
                count++;
            else
                count = 1;

            max = Math.max(max, count);
        }

        return Math.max(2 * max - n, n % 2);
    }
}
