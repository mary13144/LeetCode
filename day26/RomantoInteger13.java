package day26;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/11 18:22
 * @Version 1.0
 */
public class RomantoInteger13 {
    public int romanToInt(String s) {
        if (s.length()==0)
            return 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M', 1000);
        int sum = map.get(s.charAt(s.length()-1));
        int pre = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2;i>=0;i--){
            int flag = map.get(s.charAt(i));
            if (flag>=pre){
                sum+=flag;
            }else {
                sum-=flag;
            }
            pre=flag;
        }
        return sum;
    }
}
