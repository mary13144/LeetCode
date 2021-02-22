package day10;

import com.sun.org.apache.bcel.internal.generic.DADD;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 1:05
 * @Version 1.0
 */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        char[] str1 = new char[s.length()];
        char[] str2 = new char[s.length()];
        for (int i = 0 ;i<s.length();i++){
            str1[i]=s.charAt(i);
            str2[i]=t.charAt(i);
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int j = 0;j<s.length();j++){
            if (str1[j]!=str2[j])
                return false;
        }
        return true;
    }

}
