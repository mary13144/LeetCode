package day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/30 13:55
 * @Version 1.0
 */
public class Subsets_II90 {
    //递归回溯
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> flag = new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList<>());
        dfssub(ans,flag,nums,0);
        return ans;
    }
    public void dfssub(List<List<Integer>> ans,List<Integer> flag,int[] nums,int n){
        for (int i = n;i<nums.length;i++){
            if (i>n&&nums[i]==nums[i-1]){
                continue;
            }
            flag.add(nums[i]);
            ans.add(new ArrayList<>(flag));
            dfssub(ans,flag,nums,i+1);
            flag.remove(flag.size()-1);
        }
    }
}
