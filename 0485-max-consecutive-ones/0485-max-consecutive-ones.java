class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currones = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums [i] == 1 ){
                currones += 1;
            }
            if(nums[i] != 1){
                max = Math.max(max,currones);
                currones = 0;
            }
        }
        max = Math.max(max,currones);
        return max;
    }
}