class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] stack = new int[nums2.length];
        int top = -1;

        for (int num : nums2) {
            while (top >= 0 && stack[top] < num) {
                map.put(stack[top--], num);
            }
            stack[++top] = num;
        }

        while (top >= 0) {
            map.put(stack[top--], -1);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
