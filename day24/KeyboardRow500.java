package day24;

import java.util.*;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/9 19:48
 * @Version 1.0
 */
public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 =  "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        String[] strings = new String[]{s1,s2,s3};
        int flag = 0;
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<words.length;i++){
            if (s1.contains(words[i].charAt(0)+""))
                flag=0;
            else if (s2.contains(words[i].charAt(0)+""))
                flag=1;
            else
                flag=2;
            int j = 0;
            while (j<words[i].length()){
                if (strings[flag].contains(words[i].charAt(j)+""))
                    j++;
                else
                    break;
                if (j==words[i].length()){
                    ans.add(words[i]);
                }
            }
        }
        String[] result = new String[ans.size()];
        Iterator<String> iterator = ans.iterator();
        int m = 0;
        while (iterator.hasNext()){
            result[m]=iterator.next();
            m++;
        }
        return result;
    }
}
