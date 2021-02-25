package day12;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/23 0:27
 * @Version 1.0
 */
public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        if (nums.length==0)
            return;
        int j=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=0)
                nums[j++]=nums[i];
        }
        while (j<nums.length){
            nums[j++]=0;
        }
    }
}
