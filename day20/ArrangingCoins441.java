package day20;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/3 0:17
 * @Version 1.0
 */
public class ArrangingCoins441 {
    public int arrangeCoins(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int ans = 0;
        int flag = 1;
        while (true){
            if (n-flag>=0)
                ans++;
            if (n-flag<0)
                break;
            n-=flag;
            flag++;
        }
        return ans;
    }
}
