class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> averages = new HashSet<>();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            averages.add(sum);
            i++;
            j--;
        }
        return averages.size();
            }
        }
