package day15;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/26 2:14
 * @Version 1.0
 */
public class FindtheDifference389 {
    public char findTheDifference(String s, String t) {
        if (s.length()==0)
            return t.charAt(0);
        int[] flag=new int[26];
        for (int i = 0;i<s.length();i++){
            flag[s.charAt(i)-'a']++;
        }
        for (int j = 0;j<t.length();j++){
            flag[t.charAt(j)-'a']--;
            if (flag[t.charAt(j)-'a']<0)
                return t.charAt(j);
        }
        return ' ';
    }
}
