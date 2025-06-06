#include <string.h>
class Solution {
public:
    int uniquePaths(int m, int n) {
        int dp[n+1][m+1];
        memset(dp, 0, sizeof(dp));
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 && j==1) dp[i][j]=1;
                else{
                    dp[i][j]=dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n][m];
    }
};