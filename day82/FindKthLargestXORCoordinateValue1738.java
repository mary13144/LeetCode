package day82;


import java.util.PriorityQueue;


/**
 * @Author Mu Wenxin
 * @Date 2021/5/19 14:52
 * @Version 1.0
 */
public class FindKthLargestXORCoordinateValue1738 {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<Integer> max = new PriorityQueue<>();
        int[][] dp = new int[m][n];
        dp[0][0]=matrix[0][0];
        max.add(dp[0][0]);
        for (int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]^matrix[i][0];
            if (max.size()<k){
                max.add(dp[i][0]);
            }else {
                if (dp[i][0]>max.peek()){
                    max.add(dp[i][0]);
                    max.poll();
                }
            }
        }
        for (int j=1;j<n;j++){
            dp[0][j]=dp[0][j-1]^matrix[0][j];
            if (max.size()<k){
                max.add(dp[0][j]);
            }else {
                if (dp[0][j]>max.peek()){
                    max.add(dp[0][j]);
                    max.poll();
                }
            }

        }
        for (int i = 1;i<m;i++){
            for (int j = 1;j<n;j++){
                dp[i][j]=dp[i-1][j]^dp[i][j-1]^dp[i-1][j-1]^matrix[i][j];
                if (max.size()<k){
                    max.add(dp[i][j]);
                }else {
                    if (dp[i][j]>max.peek()){
                        max.add(dp[i][j]);
                        max.poll();
                    }
                }

            }
        }
        return max.peek();
    }
}
