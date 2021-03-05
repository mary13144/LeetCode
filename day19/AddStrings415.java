package day19;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/2 1:46
 * @Version 1.0
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        char[] big = num1.length()>=num2.length()?num1.toCharArray():num2.toCharArray();
        char[] small = num1.length()<num2.length()?num1.toCharArray():num2.toCharArray();
        int l = big.length-1;
        int s = small.length-1;
        int carry = 0;
       while (l>=0||s>=0){
           if (l>=0)
               carry+=big[l]-'0';
           if (s>=0)
               carry+=small[s]-'0';
           big[l]=(char) (carry%10+'0');
           carry/=10;
           l--;
           s--;
       }
       if (carry>0)
           return "1"+String.valueOf(big);
       return String.valueOf(big);
    }

    public static void main(String[] args) {
        AddStrings415 test = new AddStrings415();
        String s = test.addStrings("6994", "36");
        System.out.println(s);
    }
}
