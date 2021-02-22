package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 2:20
 * @Version 1.0
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        StringBuffer ans = new StringBuffer("");
        while (n!=0){
            int x = n%26;
            n/=26;
            if (x==0){
                x=26;
                n-=1;
            }
            ans.append((char) ('A'+x-1));
        }
        return ans.reverse().toString();
    }
}
