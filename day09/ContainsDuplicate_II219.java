package day09;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 0:10
 * @Version 1.0
 */
public class ContainsDuplicate_II219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length==0||nums.length==1)
            return false;

        for (int i = 0;i<nums.length;i++){
            for (int j =i+1;j<=i+k&&j<nums.length;j++){
                if (nums[i]==nums[j])
                    return true;
            }
        }
        return false;

    }
}
