package day21;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/4 2:02
 * @Version 1.0
 */
public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1;i*2<=len;i++){
            if (len%i==0){
                boolean flag = true;
                for (int j = i;j<len;j++){
                    if (s.charAt(j)!=s.charAt(j-i)){
                        flag=false;
                        break;
                    }
                }
                if (flag)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern459 test = new RepeatedSubstringPattern459();
        boolean abab = test.repeatedSubstringPattern("abab");
        System.out.println(abab);
    }
}
