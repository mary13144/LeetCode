package day71;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/29 17:06
 * @Version 1.0
 */
public class FrogJumpFrogJump403 {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (stones[1]!=1)
            return false;
        boolean[][] dp = new boolean[n+1][n+1];
        dp[1][1]=true;
        for (int i = 2;i<n;i++){
            for (int j = 1;j<i;j++){
                int k = stones[i]-stones[j];
                if (k<=j+1){
                    dp[i][k]=dp[j][k-1]||dp[j][k]||dp[j][k+1];
                }
            }
        }
        for (int i = 1;i<n;i++){
            if (dp[n-1][i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FrogJumpFrogJump403 test = new FrogJumpFrogJump403();
        boolean b = test.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17});
        System.out.println(b);
    }
}
