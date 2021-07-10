package day90;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/29 12:59
 * @Version 1.0
 */
public class NumberofSubmatricesThatSumtoTarget1074 {
//    //前缀和+暴力
//    public int numSubmatrixSumTarget(int[][] matrix, int target) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int[][] dp = new int[m+1][n+1];
//        int ans = 0;
//        //前缀和
//        for (int i = 1;i<=m;i++){
//            for (int j = 1;j<=n;j++){
//                dp[i][j]=dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1]+matrix[i-1][j-1];
//            }
//        }
//        //暴力搜索
//        for (int i = 1;i<=m;i++){
//            for (int j = 1;j<=n;j++){
//                for (int k = i;k>0;k--){
//                    for (int l = j;l>0;l--){
//                        int flag = dp[i][j]-dp[i][l-1]-dp[k-1][j]+dp[k-1][l-1];
//                        if (flag==target)
//                            ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
      public int numSubmatrixSumTarget(int[][] matrix, int target) {
          int m = matrix.length;
          int n = matrix[0].length;
          int[][] dp = new int[m+1][n+1];
          int ans = 0;
          //前缀和
          for (int i = 1;i<=m;i++){
              for (int j = 1;j<=n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1]+matrix[i-1][j-1];
              }
          }
          //搜索
          for (int top = 1;top<=m;top++){
              for (int bot = top;bot<=m;bot++){
                  int cursum = 0;
                  HashMap<Integer,Integer> map = new HashMap<>();
                  for (int r = 1;r<=n;r++){
                      cursum = dp[bot][r]-dp[top-1][r];
                      if (cursum==target)
                          ans++;
                      if (map.containsKey(cursum-target))
                          ans+=map.get(cursum-target);
                      map.put(cursum,map.getOrDefault(cursum,0)+1);
                  }
              }
          }
          return ans;
      }
}
