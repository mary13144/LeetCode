package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/24 23:39
 * @Version 1.0
 */
public class ReverseVowelsofaString345 {
    public String reverseVowels(String s) {
        if (s.length()==0)
            return new String("");
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('o');
        list.add('e');
        list.add('i');
        list.add('u');
        list.add('A');
        list.add('O');
        list.add('E');
        list.add('I');
        list.add('U');
        char temp;
        char[] chars = s.toCharArray();
        for (int i = 0,j=chars.length-1;i<j;){
            if (!list.contains(chars[i]))
                i++;
            if (!list.contains(chars[j]))
                j--;
            if (list.contains(chars[i])&&list.contains(chars[j])){
                temp = chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
        }
        String s1 = String.valueOf(chars);
        return s1;
    }
}
