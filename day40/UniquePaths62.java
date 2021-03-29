package day40;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/25 17:31
 * @Version 1.0
 */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j = 0;j<n;j++){
               if (i==0||j==0)
                   dp[i][j]=1;
               else
                   dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
