package day28;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/13 19:55
 * @Version 1.0
 */
public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        if (nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        int pre = 0;
        for (int i = 0;i<nums.length;i++){
            if (i==0){
                if (nums[i]!=nums[i+1])
                    return nums[i];
            }else if (i==nums.length-1){
                if (nums[i-1]!=nums[i])
                    return nums[i];
            }else {
                if (nums[i-1]!=nums[i]&&nums[i]!=nums[i+1])
                    return nums[i];
            }
        }
        return -1;
    }
}
