package day20;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/3 1:26
 * @Version 1.0
 */
public class MinimumMovestoEqualArrayElements453 {
    public int minMoves(int[] nums) {
        if (nums.length==0)
            return 0;
        if (nums.length==1)
            return 0;
        int sum = 0;
        int min = nums[0];
        for (int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if (nums[i]<min)
                min=nums[i];
        }
        return sum-min*nums.length;
    }
}
