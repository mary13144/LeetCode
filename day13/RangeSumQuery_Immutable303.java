package day13;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/24 1:17
 * @Version 1.0
 */
public class RangeSumQuery_Immutable303 {
    private int[] sums;

    //加个void防止编译器报错
    public void NumArray(int[] nums) {
        if (nums.length==0)
            return;
        sums=new int[nums.length];
        sums[0]=nums[0];
        for (int i = 1;i<nums.length;i++){
            sums[i]=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i==0)
            return sums[j];
        else
            return sums[j]-sums[i-1];
    }
}
