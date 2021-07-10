package day112;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/7/10 11:19
 * @Version 1.0
 */
public class data_structuresix {
    public int firstUniqChar(String s) {
        Map<Character,Integer> flag = new LinkedHashMap<>();
        int n = s.length();
        for (int i = 0;i<n;i++){
            char x = s.charAt(i);
            flag.put(x,flag.getOrDefault(x,0)+1);
        }
        for (int i = 0;i<n;i++){
            if (flag.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] flag = new int[26];
        int n1 = magazine.length();
        int n = ransomNote.length();
        for (int i = 0;i<n1;i++){
            int x = (int) (magazine.charAt(i)-'a');
            flag[x]++;
        }
        for (int i = 0;i<n;i++){
            int x = (int) (ransomNote.charAt(i)-'a');
            flag[x]--;
            if (flag[x]<0)
                return false;
        }
        return true;
    }


    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1!=len2)
            return false;
        int[] flag = new int[26];
        for (int i = 0;i<len1;i++){
            flag[(int) s.charAt(i)-'a']++;
            flag[(int) t.charAt(i)-'a']--;
        }
        for (int i = 0;i<26;i++){
            if (flag[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        data_structuresix test = new data_structuresix();
        int leetcode = test.firstUniqChar("dddccdbba");
        System.out.println(leetcode);
    }
}
