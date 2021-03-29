package day36;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/21 16:19
 * @Version 1.0
 */
public class JumpGame_II45 {
    //太凌乱
//    public int jump(int[] nums) {
//        if (nums.length<=1)
//            return 0;
//        int count = 0;
//        int i = 0;
//        int len = nums.length;
//        while (i<len){
//            if (nums[i]+i>=len-1){
//                count++;
//                break;
//            }
//            int maxpostion=nums[i+1]+i+1;
//            int flag = 0;
//            for (int j = i+1;j<=i+nums[i];j++){
//                if (nums[j]+j>=maxpostion){
//                    maxpostion=nums[j]+j;
//                    flag=j;
//                }
//                if (maxpostion>=len-1){
//                    break;
//                }
//            }
//            i=flag;
//            count++;
//        }
//        return count;
//    }

    //整洁代码后
//    public int jump(int[] nums) {
//        int count = 0;
//        int maxpostion = 0;
//        int endstep=0;
//        for (int i = 0;i<nums.length-1;i++){
//            maxpostion = Math.max(maxpostion, i + nums[i]);
//            if (i==endstep){
//                endstep=maxpostion;
//                count++;
//            }
//        }
//        return count;
//    }
    //动态规划dp
    public int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1;i<len;i++){
            for (int j = 0;j<i;j++){
                if (nums[j]+j>=i){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[len-1];
    }
    public static void main(String[] args) {
        JumpGame_II45 test = new JumpGame_II45();
        int jump = test.jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(jump);
    }
}
