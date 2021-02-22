package day09;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 1:29
 * @Version 1.0
 */
public class PowerofTwo1_231 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
