package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 2:51
 * @Version 1.0
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int ans = 0;
        int len = s.length()-1;
        for (int i = 0;i<s.length();i++){
            int x=(int) s.charAt(i)-64;
            ans=ans+(int) Math.pow(26,len--)*x;
        }
        return ans;
    }
}
