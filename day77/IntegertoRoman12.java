package day77;

import java.util.TreeMap;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/14 16:38
 * @Version 1.0
 */
public class IntegertoRoman12 {
    public String intToRoman(int num) {
        TreeMap<Integer,String> flag = new TreeMap();
        flag.put(1,"I");
        flag.put(4,"IV");
        flag.put(5,"V");
        flag.put(9,"IX");
        flag.put(10,"X");
        flag.put(40,"XL");
        flag.put(50,"L");
        flag.put(90,"XC");
        flag.put(100,"C");
        flag.put(400,"CD");
        flag.put(500,"D");
        flag.put(900,"CM");
        flag.put(1000,"M");
        StringBuffer ans = new StringBuffer();
        while (num!=0){
            int temp = flag.floorKey(num);
            ans.append(flag.get(temp));
            num-=temp;
        }
        return ans.toString();
    }
}
