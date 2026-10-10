class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int max = -1;
        for (int n : nums) {
            if (n > 0 && set.contains(-n)) {
                max = Math.max(max, n);
            }
        }

        return max;
    }
}
