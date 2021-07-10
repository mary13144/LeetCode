package day95;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/7 10:51
 * @Version 1.0
 */
public class TargetSum494 {
    //普通dfs
//    int ans = 0;
//    public int findTargetSumWays(int[] nums, int target) {
//        dfsresearch(nums,target,0);
//        return ans;
//    }
//
//    public void dfsresearch(int[] nums,int target,int i){
//        if (i==nums.length&&target==0){
//            ans++;
//            return;
//        }
//        if (i>=nums.length)
//            return;
//        dfsresearch(nums,target+nums[i],i+1);
//        dfsresearch(nums,target-nums[i],i+1);
//    }

    //记忆化搜索
    Map<String,Integer> map = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        return dfsresearch(nums,target,0);
    }

    public int dfsresearch(int[] nums,int target,int i){
        if (i==nums.length){
            if (target==0)
                return 1;
            else
                return 0;
        }
        String key = target+"_"+i;
        if (map.containsKey(key))
            return map.get(key);
        int left = dfsresearch(nums,target+nums[i],i+1);
        int right = dfsresearch(nums,target-nums[i],i+1);
        map.put(key,left+right);
        return left+right;
    }
}
