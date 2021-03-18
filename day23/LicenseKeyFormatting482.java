package day23;


/**
 * @Author Mu Wenxin
 * @Date 2021/3/8 13:41
 * @Version 1.0
 */
public class LicenseKeyFormatting482 {
    public String licenseKeyFormatting(String S, int K) {
        String s1 = S.toUpperCase();
        String[] str = s1.split("-");
        StringBuffer ans = new StringBuffer();
        for (int i = 0;i<str.length;i++){
            ans.append(str[i]);
        }
        for (int i = ans.length()-K;i>0;i=i-K){
            ans.insert(i,"-");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormatting482 test = new LicenseKeyFormatting482();
        String s = test.licenseKeyFormatting("---", 3);
        System.out.println(s);
    }
}
