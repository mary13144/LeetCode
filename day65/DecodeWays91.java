package day65;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/21 8:43
 * @Version 1.0
 */
public class DecodeWays91 {

    public int numDecodings(String s) {
        int n = s.length();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for (int i = 1;i<=n;i++){
            f3=0;
            if (s.charAt(i-1)!='0')
                f3+=f2;
            if (i>1&&s.charAt(i-2)!='0'&&(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0')<=26)
                f3+=f1;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        DecodeWays91 test = new DecodeWays91();
        int i = test.numDecodings("226");
        System.out.println(i);
    }
}
