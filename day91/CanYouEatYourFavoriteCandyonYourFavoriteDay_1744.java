package day91;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/1 16:31
 * @Version 1.0
 */
public class CanYouEatYourFavoriteCandyonYourFavoriteDay_1744 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        int len = queries.length;
        long[] pre = new long[n+1];
        for (int i = 1;i<=n;i++){
            pre[i]=pre[i-1]+candiesCount[i-1];
        }
        boolean[] ans = new boolean[len];
        for (int i = 0;i<len;i++){
            int type = queries[i][0];
            long day = queries[i][1];
            long dayeatmax = queries[i][2];
            long prenum = pre[type];
            long lastnum = pre[type+1];
            if (lastnum>day&&prenum<(dayeatmax*(day+1)))
                ans[i]=true;
            else
                ans[i]=false;
        }
        return ans;
    }
}
