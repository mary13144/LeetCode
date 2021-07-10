package day108;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/7/6 17:30
 * @Version 1.0
 */
public class data_structuretwo {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> flag = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if (flag.containsKey(target-nums[i]))
                return new int[]{flag.get(target-nums[i]),i};
            flag.put(nums[i],i );
        }
        return null;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        for (int k = m+n-1;k>=0;k--){
            if (i>=0&&j>=0){
                if (nums1[i]<nums2[j]){
                    nums1[k]=nums2[j];
                    j--;
                }else {
                    nums1[k]=nums1[i];
                    i--;
                }
            }else if (j>=0){
                nums1[k]=nums2[j];
                j--;
            }
        }
    }
}
