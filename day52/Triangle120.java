package day52;

import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/6 17:27
 * @Version 1.0
 */
public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n==1)
            return triangle.get(0).get(0);
        int[][] dp = new int[n][n];
        dp[0][0]=triangle.get(0).get(0);
        for (int i = 1;i<n;i++){
            for (int j = 0;j<=i;j++){
                if (j==0)
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                else if (i==j){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                } else
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
            }
        }
        int minans = dp[n-1][0];
        for (int i = 1;i<n;i++){
            if (dp[n-1][i]<minans)
                minans=dp[n-1][i];
        }
        return minans;
    }
}
