package day28;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/13 17:23
 * @Version 1.0
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int pre = nums[0];
        int maxans = nums[0];
        for (int i = 1;i<nums.length;i++){
            pre+=nums[i];
            pre = Math.max(nums[i],pre);
            maxans = Math.max(maxans,pre);
        }
        return maxans;
    }
}
