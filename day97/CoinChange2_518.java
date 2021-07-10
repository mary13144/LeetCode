package day97;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/10 18:35
 * @Version 1.0
 */
public class CoinChange2_518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0]=1;
        for (int x :coins){
            for (int i = x;i<=amount;i++){
                dp[i]+=dp[i-x];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        CoinChange2_518 test = new CoinChange2_518();
        test.change(5,new int[]{1,2,5});
    }
}
