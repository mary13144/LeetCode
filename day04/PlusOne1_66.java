package day04;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/15 1:11
 * @Version 1.0
 */
public class PlusOne1_66 {
    public int[] plusOne(int[] digits) {
        StringBuffer m = new StringBuffer();
        for (int i = 0; i<digits.length; i++){
            m.append(digits[i]);
        }
        String s = m.toString();
        BigDecimal bigDecimal = new BigDecimal(s);
        BigDecimal plus = bigDecimal.add(new BigDecimal(1));
        String s1 = plus.toString();
        int [] end = new int[s1.length()];
        for (int i=0;i<s1.length();i++){
            end[i]=Integer.parseInt(String.valueOf(s1.charAt(i)));;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] x = new int[]{4,3,2,1};
        PlusOne1_66 test = new PlusOne1_66();
        int[] ints = test.plusOne(x);
        System.out.println(Arrays.toString(ints));
    }
}
