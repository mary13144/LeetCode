package day22;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/4 23:56
 * @Version 1.0
 */
public class HammingDistance461 {
    /*public int hammingDistance(int x, int y) {
        int ans = 0;
        while (x!=0||y!=0){
            if ((x&1)!=(y&1)){
                ans++;
            }
            x=x>>1;
            y=y>>1;
        }
        return ans;
    }*/
    public int hammingDistance(int x, int y) {
        int ans=0;
        int z = x^y;
        while (z!=0){
            if ((z&1)!=0){
                ans++;
            }
            z=z>>1;
        }
        return ans;
    }
}
