package day49;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/3 16:44
 * @Version 1.0
 */
public class LongestCommonSubsequence1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length()==0||text2.length()==0)
            return 0;
        int n=text1.length();
        int m=text2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = 0;i<=n;i++){
            dp[i][0]=0;
        }
        for (int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
