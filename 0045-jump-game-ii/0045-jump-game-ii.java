class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1_000_000_000 );
        dp[0]=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=Math.min(dp.length-1, nums[i]+i); j++){
                dp[j] = Math.min(dp[i]+1, dp[j]);
            }
        }
        return dp[dp.length-1];
    }
}