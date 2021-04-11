package day44;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/29 13:17
 * @Version 1.0
 */
public class ReverseBits190 {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
    //错误代码
//    public int reverseBits(int n) {
//        String s1 = Integer.toBinaryString(n);
//        StringBuffer str = new StringBuffer(s1);
//        StringBuffer s2 = str.reverse();
//        int i = Integer.parseInt(s2.toString(), 2);
//        return i;
//    }

    public static void main(String[] args) {
        ReverseBits190 test = new ReverseBits190();
        test.reverseBits(87);
    }
}
