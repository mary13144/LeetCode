package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/20 20:25
 * @Version 1.0
 */
public class CombinationSum_II40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> flag = new ArrayList<>();
        Arrays.sort(candidates);
        dfssum2(ans,flag,candidates,target,0);
        return ans;
    }
    //不用for循环的回溯
//    private void dfssum2(List<List<Integer>> ans,List<Integer> flag,int[] candidates,int target,int i){
//        if (target==0){
//            if (!ans.contains(flag)){
//                ans.add(new ArrayList<>(flag));
//            }
//            return;
//        }
//        if (i==candidates.length)
//            return;
//        if (candidates[i]>target)
//            return;
//        else {
//            flag.add(candidates[i]);
//            dfssum2(ans,flag,candidates,target-candidates[i],i+1);
//            flag.remove(flag.size()-1);
//            dfssum2(ans,flag,candidates,target,i+1);
//        }
//    }
    //使用for循环的回溯
    private void dfssum2(List<List<Integer>> ans,List<Integer> flag,int[] candidates,int target,int i){
        if (target==0){
            ans.add(new ArrayList<>(flag));
            return;
        }
        for (int j=i;j<candidates.length;j++){
            if (candidates[j]<=target){
                if (j>i&&candidates[j]==candidates[j-1])
                    continue;
                flag.add(candidates[j]);
                dfssum2(ans,flag,candidates,target-candidates[j],j+1);
                flag.remove(flag.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum_II40 test = new CombinationSum_II40();
        List<List<Integer>> lists = test.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        System.out.println(lists);
    }
}
