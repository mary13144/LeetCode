package day25;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/10 20:19
 * @Version 1.0
 */
public class BestTimetoBuyandSellStock121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0;i<prices.length;i++){
            if (prices[i]<min)
                min=prices[i];
            else {
                if ((prices[i]-min)>ans){
                    ans=prices[i]-min;
                }
            }
        }
        return ans;
    }
}
