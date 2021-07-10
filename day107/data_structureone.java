package day107;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/26 11:41
 * @Version 1.0
 */
public class data_structureone {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
//    int max = Integer.MIN_VALUE;
//    public int maxSubArray(int[] nums) {
//        maxsub(nums,0,nums.length-1);
//        return max;
//    }
//    public int maxsub(int[] nums,int left,int right){
//        if (left==right){
//            if (max<nums[left])
//                max=nums[left];
//            return nums[left];
//        }
//        int mid = left+(right-left)/2;
//        int sum = maxsub(nums,left,mid)+maxsub(nums,mid+1,right);
//        if (sum>max)
//            max=sum;
//        return sum;
//    }
}
