package day25;

import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/10 20:38
 * @Version 1.0
 */
public class BestTimetoBuyandSellStock_II122 {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);
        int sum = 0;
        int i = 1;
        while (i<prices.length){
            if (prices[i]<stack.peek()){
                stack.push(prices[i]);
            }else if (prices[i]>stack.peek()){
                sum+=prices[i]-stack.peek();
                stack.clear();
                stack.push(prices[i]);
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock_II122 test = new BestTimetoBuyandSellStock_II122();
        int i = test.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}
