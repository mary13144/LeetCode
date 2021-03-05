package day16;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/27 2:06
 * @Version 1.0
 */
public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0)
            return true;
        if (t.length()==0)
            return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int flag = 0;
        for (int i = 0;i<s1.length;i++){
            for (int j = flag;j<s2.length;){
                if (i!=s1.length-1&&j==s2.length-1)
                    return false;
                char a = s1[i];
                char b = s2[j];
                if (a!=b&&j==s2.length-1)
                    return false;
                if (a!=b)
                    j++;
                if (a==b){
                    flag=++j;
                    break;
                }
            }
        }
        return true;
    }
}
