package day53;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/7 20:48
 * @Version 1.0
 */
public class MaximumProductSubarray152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n==0)
            return 0;
        int ansmax = nums[0];
        int maxflag = nums[0];
        int minflag = nums[0];
        for (int i = 1;i<n;i++){
            int mx = maxflag;
            int mn = minflag;
            maxflag=Math.max(mx*nums[i],Math.max(mn*nums[i],nums[i]));
            minflag=Math.min(mn*nums[i],Math.min(mx*nums[i],nums[i]));
            if (maxflag>ansmax)
                ansmax=maxflag;
        }
        return ansmax==Integer.MIN_VALUE?nums[0]:ansmax;
    }

    public static void main(String[] args) {
        MaximumProductSubarray152 test = new MaximumProductSubarray152();
        test.maxProduct(new int[]{2,-1,1,1});
    }
}
