class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=0;
        for(int i=1; i<nums.length; i++) dp[i] = 1_000_000_000;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=Math.min(dp.length-1, nums[i]+i); j++){
                dp[j] = Math.min(dp[i]+1, dp[j]);
            }
        }
        return dp[dp.length-1];
    }
}