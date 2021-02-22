package day02;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/12 23:07
 * @Version 1.0
 */
public class Two_Sum1 {
    public  int[] twoSum(int[] nums,int target) {
        int n= nums.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i] + nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Two_Sum1 test=new Two_Sum1();
        int[] ints = test.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }
}
