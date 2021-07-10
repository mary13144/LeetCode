package day101;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/16 11:12
 * @Version 1.0
 */
public class StoneGame877 {

    //数学方法：先手必获胜
//    public boolean stoneGame(int[] piles) {
//        return true;
//    }
    //动态规划
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i = n-1;i>=0;i--){
            for (int j = i;j<n;j++){
                if (i==j)
                    dp[i][j]=piles[i];
                else {
                    dp[i][j]=Math.max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1]>0;
    }
}
