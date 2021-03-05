package day18;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 19:20
 * @Version 1.0
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int[] flag = new int[128];
        int ans = 0;
        for (int i = 0;i<s.length();i++){
            flag[s.charAt(i)]++;
        }
        for (int temp:flag){
            ans+=temp/2*2;
            if (temp%2==1&&ans%2==0){
                ans++;
            }
        }
        return ans;
    }
}
