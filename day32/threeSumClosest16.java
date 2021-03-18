package day32;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/17 17:19
 * @Version 1.0
 */
public class threeSumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int curentbest= 10000;
        for (int i = 0;i<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            while (start<end){
               int sum = nums[i]+nums[start]+nums[end];
               if (sum==target)
                   return sum;
               if (Math.abs(target-sum)<Math.abs(target-curentbest)){
                   curentbest=sum;
               }
               if (sum>target){
                   end--;
                   while (start<end&&nums[end]==nums[end+1]){
                       end--;
                   }
               }else {
                   start++;
                   while (start<end&&nums[start]==nums[start-1]){
                       start++;
                   }
               }
            }
        }
        return curentbest;
    }
}
