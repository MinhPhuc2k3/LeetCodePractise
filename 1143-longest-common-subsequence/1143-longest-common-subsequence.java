class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp =new int[text1.length()][text2.length()];
        for(int i=0; i<text1.length(); i++) {
            for(int j=0; j<text2.length(); j++) {
                int maxL = 0;
                if(text1.charAt(i) == text2.charAt(j)) {
                    if(i > 0 && j > 0)maxL = dp[i-1][j-1] + 1;
                    else maxL = 1;
                }
                if(j > 0) maxL = Math.max(maxL, dp[i][j-1]);
                if(i > 0) maxL = Math.max(maxL, dp[i-1][j]);
                dp[i][j] = maxL;
            }
        }
        return dp[text1.length()-1][text2.length()-1];
    }
}