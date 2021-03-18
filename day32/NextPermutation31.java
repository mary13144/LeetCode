package day32;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/17 18:41
 * @Version 1.0
 */
public class NextPermutation31 {
    public void nextPermutation(int[] nums) {
        if (nums.length==1)
            return;
        for (int i = nums.length-1;i>0;i--){
            if (nums[i-1]<nums[i]){
                int currentmin = nums[i-1];
                for (int j=nums.length-1;j>=i;j--){
                    if (nums[j]>currentmin){
                        currentmin=nums[j];
                        break;
                    }
                }
                int temp = nums[i-1];
                nums[i-1]=currentmin;
                int[] flag = new int[nums.length-i];
                int one = 1;
                for (int j=nums.length-1,x=0;j>=i;j--,x++){
                    if (one==1&&nums[j]==currentmin){
                        flag[x]=temp;
                        one--;
                    }
                    else
                        flag[x]=nums[j];
                }
                Arrays.sort(flag);
                for (int j=i,x=0;j<nums.length;j++,x++){
                    nums[j]=flag[x];
                }
                return;
            }
        }
        Arrays.sort(nums);
    }
}
