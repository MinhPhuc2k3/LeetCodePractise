class Solution {
    public boolean canJump(int[] nums) {
        int stepAcc = 1;
        for(int i=0; i<nums.length; i++){
            stepAcc--;
            if(stepAcc < 0) break;
            stepAcc = Math.max(nums[i], stepAcc);
            if(i==nums.length-1) return true;
        }
        return false;
    }
}