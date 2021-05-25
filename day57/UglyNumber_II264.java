package day57;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/11 12:18
 * @Version 1.0
 */
public class UglyNumber_II264 {
    //小顶堆
//    public int nthUglyNumber(int n) {
//        int[] factory={2,3,5};
//        Set<Long> set = new HashSet<>();
//        PriorityQueue<Long> queue = new PriorityQueue<>();
//        set.add(1L);
//        queue.add(1L);
//        int uglynumber = 0;
//        for (int i = 0;i<n;i++){
//            long flag = queue.poll();
//            uglynumber = (int) flag;
//            for (int temp:factory){
//                if (set.add(temp*flag))
//                    queue.add(temp*flag);
//            }
//        }
//        return uglynumber;
//    }
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0]=1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1;i<n;i++){
            dp[i]=Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
            if (dp[i]==dp[p2]*2)
                p2++;
            if (dp[i]==dp[p3]*3)
                p3++;
            if (dp[i]==dp[p5]*5)
                p5++;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        UglyNumber_II264 test = new UglyNumber_II264();
        int i = test.nthUglyNumber(10);
        System.out.println(i);
    }
}
