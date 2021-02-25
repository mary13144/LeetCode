package day12;


import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/23 1:31
 * @Version 1.0
 */
public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 && s.length() == 0)
            return true;
        if (pattern.length() == 0 || s.length() == 0)
            return false;
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char flag = pattern.charAt(i);
            if (map.containsKey(flag)) {
                if (!map.get(flag).equals(str[i]))
                    return false;
            } else {
                if (set.contains(str[i]))
                    return false;
                else {
                    map.put(flag, str[i]);
                    set.add(str[i]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", str = "dog cat cat dog";
        WordPattern290 test = new WordPattern290();
        boolean b = test.wordPattern(pattern, str);
        System.out.println(b);
    }
}
