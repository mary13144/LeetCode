package day20;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/3 0:27
 * @Version 1.0
 */
public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i<nums.length;i++){
            nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for (int j = 0 ;j<nums.length;j++){
            if (nums[j]>0)
                ans.add(j+1);
        }
        return ans;
    }
}
