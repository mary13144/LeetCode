package day04;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/15 2:01
 * @Version 1.0
 */
public class PlusOne2_66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        for (int i = len; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
            int[] x = new int[digits.length+ 1];
            x[0] = 1;
            return x;
    }
}
