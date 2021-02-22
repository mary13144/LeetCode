package day09;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/20 0:20
 * @Version 1.0
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length==0||nums.length==1)
            return false;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}
