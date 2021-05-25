package day59;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/13 16:16
 * @Version 1.0
 */
public class CombinationSum_III216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> flag = new ArrayList<>();
        dfssum(k,n,1,flag,ans);
        return ans;
    }
    public void dfssum(int k,int n,int i,List<Integer> flag,List<List<Integer>> ans){
        if (flag.size()>=k)
            return;
        if (i>9)
            return;
        if (i>n)
            return;
        flag.add(i);
        if (i==n&&flag.size()==k)
            ans.add(new ArrayList<>(flag));
        dfssum(k,n-i,i+1,flag,ans);
        flag.remove(flag.size()-1);
        dfssum(k,n,i+1,flag,ans);
    }
    //带for循环的回溯
//    public List<List<Integer>> combinationSum3(int k, int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> flag = new ArrayList<>();
//        dfssum(k,n,1,flag,ans);
//        return ans;
//    }
//    public void dfssum(int k,int n,int i,List<Integer> flag,List<List<Integer>> ans){
//        if (flag.size()>k)
//            return;
//        if (n==0&&flag.size()==k)
//            ans.add(new ArrayList<>(flag));
//        if (i>n)
//            return;
//        for (int j = i;j<=9;j++){
//            flag.add(j);
//            dfssum(k,n-j,j+1,flag,ans);
//            flag.remove(flag.size()-1);
//        }
//    }
}
