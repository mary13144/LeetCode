package day04;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/14 22:53
 * @Version 1.0
 */
public class CountandSay38 {
    public String countAndSay(int n) {
        if (n==1)
            return "1";
        String nums = countAndSay(n-1);
        StringBuffer str = new StringBuffer();
        for (int i=0;i<nums.length();i++){
            int count = 1;
            while (i<nums.length()-1&&nums.charAt(i)==nums.charAt(i+1)){
                count+=1;
                i++;
            }
            str.append(count);
            str.append(nums.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        CountandSay38 test = new CountandSay38();
        String s = test.countAndSay(5);
        System.out.println(s);
    }
}
