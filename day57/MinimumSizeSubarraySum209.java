package day57;

import com.sun.org.apache.bcel.internal.generic.IFGE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/11 21:45
 * @Version 1.0
 */
public class MinimumSizeSubarraySum209 {
    //队列模拟滑动窗口
//    public int minSubArrayLen(int target, int[] nums) {
//        Queue<Integer> queue = new LinkedList<>();
//        int sum = 0;
//        int ans = 0;
//        int i = 0;
//        while (i<nums.length){
//            if (sum<target){
////                if (i==nums.length)
////                    break;
//                queue.add(nums[i]);
//                sum+=nums[i];
//            }else {
//                if (ans==0){
//                    ans=queue.size();
//                    continue;
//                }else{
//                    if (queue.size()<ans)
//                        ans=queue.size();
//                    int flag = queue.poll();
//                    sum-=flag;
//                    continue;
//                }
//            }
//            i++;
//        }
//        if (sum>=target){
//            if (ans==0)
//                ans=queue.size();
//                while (sum>=target){
//                    if (queue.size()<ans)
//                        ans=queue.size();
//                    sum-=queue.poll();
//                }
//        }
//        return ans;
//    }

//    public static void main(String[] args) {
//        MinimumSizeSubarraySum209 test = new MinimumSizeSubarraySum209();
//        int i = test.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
//        System.out.println(i);
//    }
}
