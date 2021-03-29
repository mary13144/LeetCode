package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/20 17:01
 * @Version 1.0
 */
public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> flag = new ArrayList<>();
        Arrays.sort(candidates);
        dfsnums(candidates,target,flag,ans,0);
        return ans;
    }
    private void dfsnums(int[] nums,int target,List<Integer> flag,List<List<Integer>> ans,int num){
        if (target==0){
            ans.add(new ArrayList<>(flag));
            return;
        }
        if (nums[num]>target)
            return;
        else {
            for (int i = num;i<nums.length;i++){
                flag.add(nums[i]);
                dfsnums(nums,target-nums[i],flag,ans,i);
                flag.remove(flag.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum39 test = new CombinationSum39();
        List<List<Integer>> lists = test.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }
}
