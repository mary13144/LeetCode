package day92;

import jdk.nashorn.internal.runtime.FindProperty;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/2 10:57
 * @Version 1.0
 */
public class ContinuousSubarraySum523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int[] pre = new int[n+1];
        pre[1]=pre[0]+nums[0];
        for (int i = 2;i<=n;i++){
            pre[i]=pre[i-1]+nums[i-1];
            set.add(pre[i-2]%k);
            if (set.contains(pre[i]%k))
                return true;
        }
        return false;
    }
    //纯暴力
//    public boolean checkSubarraySum(int[] nums, int k) {
//        int n = nums.length;
//        for (int i = 0;i<n;i++){
//            int flag = nums[i];
//            for (int j = i+1;j<n;j++){
//                flag+=nums[j];
//                if (flag%k==0)
//                    return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        ContinuousSubarraySum523 test = new ContinuousSubarraySum523();
        boolean b = test.checkSubarraySum(new int[]{1,3,6,0,9,6,9}, 7);
        System.out.println(b);
    }
}
