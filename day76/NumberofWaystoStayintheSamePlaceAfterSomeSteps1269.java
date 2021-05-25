package day76;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/13 17:19
 * @Version 1.0
 */
public class NumberofWaystoStayintheSamePlaceAfterSomeSteps1269 {
    public int numWays(int steps, int arrLen) {
        int max = Math.min(steps/2,arrLen-1);
        int mod =(int) 1e9+7;
        int[][] dp = new int[steps+1][max+1];
        dp[steps][0]=1;
        for (int i = steps-1;i>=0;i--){
            int edge = Math.min(i,max);
            for (int j = 0;j<=edge;j++){
                dp[i][j]=(dp[i+1][j]+dp[i][j])%mod;
                if (j<max)
                    dp[i][j]=(dp[i+1][j+1]+dp[i][j])%mod;
                if (j>0)
                    dp[i][j]=(dp[i+1][j-1]+dp[i][j])%mod;
            }
        }
        return  dp[0][0];
    }
}
