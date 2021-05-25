package day61;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/15 16:15
 * @Version 1.0
 */
public class HouseRobber_II213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1)
            return nums[0];
        int[] dp = new int[n];
        dp[0]=0;
        dp[1]=nums[0];
        for (int i = 2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        int sum1 = dp[n-1];
        dp[1]=nums[1];
        for (int i = 2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        int sum2 = dp[n-1];
        return sum1>sum2?sum1:sum2;
    }
}
