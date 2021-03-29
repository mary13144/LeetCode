package day38;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/23 16:41
 * @Version 1.0
 */
public class JumpGame55 {
    //动态规划
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,100001);
        dp[0]=0;
        for (int i = 1;i<nums.length;i++){
            for (int j = 0;j<i;j++){
                if (j+nums[j]>=i){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                    break;
                }
            }
        }
        return dp[nums.length-1]!=100001;
    }



    public static void main(String[] args) {
        JumpGame55 test = new JumpGame55();
        boolean b = test.canJump(new int[]{1,0,1,0});
        System.out.println(b);
    }
}
