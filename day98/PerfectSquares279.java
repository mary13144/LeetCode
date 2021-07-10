package day98;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/11 15:36
 * @Version 1.0
 */
public class PerfectSquares279 {
    //方法1
//    public int numSquares(int n) {
//        int[] dp = new int[n+1];
//        for (int j = 1;j<=n;j++){
//            dp[j]=dp[j-1]+1;
//            for (int i = 1;i<=Math.sqrt(n);i++){
//                if (j>=i*i) {
//                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);
//                }else
//                   break;
//
//            }
//        }
//        return dp[n];
//    }

    //方法二
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1;i*i<=n;i++){
            for (int j = 1;j<=n;j++){
                if (j>=i*i)
                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        PerfectSquares279 test = new PerfectSquares279();
        int i = test.numSquares(13);
        System.out.println(i);

    }
}
