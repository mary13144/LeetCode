package day28;

import java.util.Locale;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/13 19:07
 * @Version 1.0
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        if (s==null||s.length()==0)
            return true;
        String s1 = s.toLowerCase();
//        String flag = "qwertyuiopasdfghjklzxcvbnm0123456789";
        StringBuffer ans = new StringBuffer();
        for (int i = 0;i<s.length();i++){
            if (Character.isLetterOrDigit(s1.charAt(i))){
                ans.append(s1.charAt(i));
            }
        }

//        for (int i = 0,j=ans.length()-1;i<=j;i++,j--){
//            if (ans.charAt(i)!=ans.charAt(j))
//                return false;
//        }
        StringBuffer reverse = new StringBuffer(ans).reverse();
        return ans.toString().equals(reverse.toString());
    }
}
