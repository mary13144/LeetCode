package day101;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/16 11:36
 * @Version 1.0
 */
public class ProfitableSchemes879 {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int p = group.length;
        int big = (int) Math.pow(10,9)+7;
        int[][][] dp = new int[p+1][n+1][minProfit+1];
        dp[0][0][0]=1;
        for (int i = 1;i<=p;i++){
            int num = group[i-1];
            int fit = profit[i-1];
            for (int j = 0;j<=n;j++){
                for (int k = 0;k<=minProfit;k++){
                    if (j>=num)
                        dp[i][j][k]=(dp[i-1][j][k]+dp[i-1][j-num][Math.max(0,k-fit)])%big;
                    else
                        dp[i][j][k]=dp[i-1][j][k];
                }
            }
        }
        int sum = 0;
        for (int j = 0;j<=n;j++){
            sum=(sum+dp[p][j][minProfit])%big;
        }
        return sum;
    }

    public static void main(String[] args) {
        ProfitableSchemes879 test = new ProfitableSchemes879();
        int i = test.profitableSchemes(64, 0, new int[]{88, 40}, new int[]{1, 2});
        System.out.println(i);
    }

}
