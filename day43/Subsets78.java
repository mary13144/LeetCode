package day43;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/28 13:20
 * @Version 1.0
 */
public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> flag = new ArrayList<>();
        dfslist(ans,flag,nums,0);
        ans.add(new ArrayList<>());
        return ans;
    }
    public void dfslist(List<List<Integer>> ans,List<Integer> flag,int[] nums,int i){
        for (int j = i;j<nums.length;j++){
            flag.add(nums[j]);
            ans.add(new ArrayList<>(flag));
            dfslist(ans,flag,nums,j+1);
            flag.remove(flag.size()-1);
        }
    }

    //位运算，LeetCode题解
//    public static List<List<Integer>> subsets(int[] nums) {
//        //子集的长度是2的nums.length次方，这里通过移位计算
//        int length = 1 << nums.length;
//        List<List<Integer>> res = new ArrayList<>(length);
//        //遍历从0到length中间的所有数字，根据数字中1的位置来找子集
//        for (int i = 0; i < length; i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j < nums.length; j++) {
//                //如果数字i的某一个位置是1，就把数组中对
//                //应的数字添加到集合
//                if (((i >> j) & 1) == 1)
//                    list.add(nums[j]);
//            }
//            res.add(list);
//        }
//        return res;
//    }

    //非递归解决。
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>(1 << nums.length);
//        //先添加一个空的集合
//        res.add(new ArrayList<>());
//        for (int num : nums) {
//            //每遍历一个元素就在之前子集中的每个集合追加这个元素，让他变成新的子集
//            for (int i = 0, j = res.size(); i < j; i++) {
//                //遍历之前的子集，重新封装成一个新的子集
//                List<Integer> list = new ArrayList<>(res.get(i));
//                //然后在新的子集后面追加这个元素
//                list.add(num);
//                //把这个新的子集添加到集合中
//                res.add(list);
//            }
//        }
//        return res;
//    }

}
