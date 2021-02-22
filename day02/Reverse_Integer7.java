package day02;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/12 23:08
 * @Version 1.0
 */
public class Reverse_Integer7 {
    public int reverse(int x) {

        String xstring=String.valueOf(x);
        int flag=1;
        String substring=xstring;
        if (x<0){
            flag=-1;
            substring = xstring.substring(1);
        }
        try {
            StringBuffer buffer = new StringBuffer(substring);
            buffer.reverse();
            Integer x1=Integer.valueOf(buffer.toString());
            return x1*flag;
        }catch (Exception e){
            return 0;
        }

    }

    public static void main(String[] args) {
        Reverse_Integer7 test = new Reverse_Integer7();
        int x=1534236469;
        int i = test.reverse(x);
        System.out.println(i);
    }

}
