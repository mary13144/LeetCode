package day96;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/9 12:07
 * @Version 1.0
 */
public class LastStoneWeight_II1049 {
    //记忆化搜索
//    public int lastStoneWeightII(int[] stones) {
//        return dfssmall(stones,0,0);
//    }
//    Map<String,Integer> map = new HashMap<>();
//    public int dfssmall(int[] stones,int i,int sum){
//        if (i==stones.length)
//            return sum;
//        String key = i+"_"+sum;
//        if (map.containsKey(key))
//            return map.get(key);
//        int left = dfssmall(stones,i+1,sum+stones[i]);
//        int right = dfssmall(stones,i+1,sum-stones[i]);
//        map.put(key,left);
//        map.put(key,right);
//        if (left>=0&&right>=0)
//            return Math.min(left,right);
//        else if (left>=0)
//            return left;
//        else
//            return right;
//    }

    //动态规划
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for (int x:stones){
            sum+=x;
        }
        int s = sum/2;
        int[][] dp = new int[n+1][s+1];
        for (int i = 1;i<=n;i++){
            int wight = stones[i-1];
            for (int j = 0;j<=s;j++){
                dp[i][j]=dp[i-1][j];
                if (j>=wight){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-wight]+wight);
                }
            }
        }
        return Math.abs(sum-dp[n][s]*2);
    }
}
