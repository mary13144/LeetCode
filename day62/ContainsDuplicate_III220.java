package day62;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/17 12:25
 * @Version 1.0
 */
public class ContainsDuplicate_III220 {
    //两层for循环超时
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        int n = nums.length;
//        if (n==0)
//            return false;
//        for (int i = 0;i<n;i++){
//            for (int j = i+1;j<=i+k&&j<n;j++){
//                long flag =(long) nums[j]-(long) nums[i];
//                if (Math.abs(flag)<=t)
//                    return true;
//            }
//        }
//        return false;
//    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        if (n<=1)
            return false;
        int j = 0;
        TreeSet<Long> set = new TreeSet<>();
        while (j<n){
            Long ceiling = set.ceiling((long) nums[j] - (long) t);
            set.add((long) nums[j]);
            if (ceiling!=null&&ceiling<=(long) nums[j] + (long) t)
                return true;
            if (j>=k)
                set.remove((long) nums[j-k]);
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate_III220 test = new ContainsDuplicate_III220();
        boolean b = test.containsNearbyAlmostDuplicate(new int[]{1,2,2,3,4,5}, 3, 0);
        System.out.println(b);
    }
}
