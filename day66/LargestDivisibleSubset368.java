package day66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/24 11:01
 * @Version 1.0
 */
public class LargestDivisibleSubset368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] flag = new int[n];
        for (int i = 0;i<n;i++){
            int len = 1;
            int pre = i;
            for (int j = 0;nums[j]<=nums[i]/2&&j<i;j++){
                if (nums[i]%nums[j]==0){
                    if (dp[j]+1>len){
                        len=dp[j]+1;
                        pre=j;
                    }
                }
            }
            dp[i]=len;
            flag[i]=pre;
        }
        int max = 0;
        int index = 0;
        for (int i = 0;i<n;i++){
            if (dp[i]>max){
                max=dp[i];
                index=i;
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (ans.size()<max){
            ans.add(nums[index]);
            index=flag[index];
        }
        return ans;
    }
}
