package day40;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/25 22:20
 * @Version 1.0
 */
public class UniquePaths_II63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m-1][n-1]==1)
            return 0;
        if (obstacleGrid[0][0]==1)
            return 0;
        int[][] dp = new int[m][n];
        for (int i = 0;i<m;i++){
            if (obstacleGrid[i][0]==0){
                dp[i][0]=1;
            }else
                break;
        }
        for (int i = 0;i<n;i++){
            if (obstacleGrid[0][i]==0){
                dp[0][i]=1;
            }else
                break;
        }
        for (int i = 1;i<m;i++){
            for (int j = 1;j<n;j++){
                if (obstacleGrid[i][j]==1)
                    continue;
                 else {
                     dp[i][j]+=dp[i-1][j]>0?dp[i-1][j]:0;
                     dp[i][j]+=dp[i][j-1]>0?dp[i][j-1]:0;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
