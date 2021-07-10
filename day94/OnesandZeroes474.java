package day94;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/6 15:31
 * @Version 1.0
 */
public class OnesandZeroes474 {
    //回溯法
//    int ans = 0;
//    public int findMaxForm(String[] strs, int m, int n) {
//        backtrack(strs,m,n,0,0);
//        return ans;
//    }
//    public void backtrack(String[] strs,int m,int n,int i,int count){
//        if (m<0||n<0)
//            return;
//        if (count>ans)
//            ans=count;
//        if (i>=strs.length)
//            return;
//        int one = onenums(strs[i]);
//        int len = strs[i].length();
//        backtrack(strs,m-(len-one),n-one,i+1,count+1);
//        backtrack(strs,m,n,i+1,count);
//    }
//    public int onenums(String str){
//        int count = 0;
//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i)=='1')
//                count++;
//        }
//        return count;
//    }
    //动态规划背包问题
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] cnt = new int[len][2];
        for (int i = 0; i < len; i++) {
            int zero = 0, one = 0;
            for (char c : strs[i].toCharArray()) {
                if (c == '0') zero++;
                else one++;
            }
            cnt[i] = new int[]{zero, one};
        }
        int[][] f = new int[m + 1][n + 1];
        for (int k = 0; k < len; k++) {
            int zero = cnt[k][0], one = cnt[k][1];
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    f[i][j] = Math.max(f[i][j], f[i - zero][j - one] + 1);
                }
            }
        }
        return f[m][n];
    }
}
