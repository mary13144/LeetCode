package day78;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/15 11:17
 * @Version 1.0
 */
public class RomantoInteger13 {
    public int romanToInt(String s) {
        Map<Character,Integer> flag = new HashMap<>();
        flag.put('I',1);
        flag.put('V',5);
        flag.put('X',10);
        flag.put('L',50);
        flag.put('C',100);
        flag.put('D',500);
        flag.put('M',1000);
        int ans = 0;
        int n = s.length();
        int i = 0;
        while (i<n-1){
            int temp = flag.get(s.charAt(i));
            int temp1 = flag.get(s.charAt(i+1));
            if (temp<temp1)
                ans-=temp;
            else
                ans+=temp;
            i++;
        }
        ans+=flag.get(s.charAt(i));
        return ans;
    }
}
