package day84;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/21 15:17
 * @Version 1.0
 */
public class UncrossedLines1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 1;i<=len1;i++){
            int num1 = nums1[i-1];
            for (int j = 1;j<=len2;j++){
                int num2 = nums2[j-1];
                if (num1==num2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
