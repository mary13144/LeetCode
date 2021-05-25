package day73;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/6 14:10
 * @Version 1.0
 */
public class DecodeXORedArray1720 {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n+1];
        ans[0]=first;
        for (int i = 0;i<n;i++){
            int up = ~encoded[i];
            int down = ~ans[i];
            ans[i+1]=(up^down);
        }
        return ans;
    }
}
