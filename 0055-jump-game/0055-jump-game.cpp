class Solution {
public:
    bool canJump(vector<int>& nums) {
        vector<int> dp(nums.size());
        dp[0]=nums[0];
        for(int i=1; i<nums.size(); i++){
            if(dp[i-1]>i-1){
                dp[i] = max(dp[i-1], nums[i]+i);
            }
            else return false;
        }
        return true;
    }
};