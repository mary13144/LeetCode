package day19;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/2 0:37
 * @Version 1.0
 */
public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        long[] ans = new long[]{Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for (int i=0;i<nums.length;i++){
            if (nums[i]>ans[0]){
                ans[2]=ans[1];
                ans[1]=ans[0];
                ans[0]=nums[i];
                continue;
            }
            if (nums[i]==ans[0])
                continue;
            if (nums[i]>ans[1]){
                ans[2]=ans[1];
                ans[1]=nums[i];
                continue;
            }
            if (nums[i]==ans[1])
                continue;
            if (nums[i]>ans[2]){
                ans[2]=nums[i];
                continue;
            }
        }
        long x=ans[2]==Long.MIN_VALUE?ans[0]:ans[2];
        return (int)x;
    }
}
