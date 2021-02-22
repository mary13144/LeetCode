package day04;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/14 23:55
 * @Version 1.0
 */
public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        if (s.equals(" ")||s.length()==0)
            return 0;
        int i=s.length()-1;
        int start=0;
        int end = s.length();
        while (i>=0&&s.charAt(i)==' '){
            end--;
            i--;
        }
        if (end==0)
            return 0;
        i=0;
        while (i<end){
            if (s.charAt(i)==' ')
                start=i+1;
            i++;
        }
        return end-start;
    }

    public static void main(String[] args) {
        String s ="a";
        LengthofLastWord58 test = new LengthofLastWord58();
        int i = test.lengthOfLastWord(s);
        System.out.println(i);
    }
}
