package day66;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/24 13:35
 * @Version 1.0
 */
public class CombinationSumIV377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0]=1;
        for (int i = 1;i<=target;i++){
            for (int num:nums){
                if (num<=i){
                    dp[i]+=dp[i-num];
                }
            }
        }
        return dp[target];
    }
}
