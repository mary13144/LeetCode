package day09;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 1:06
 * @Version 1.0
 */
public class PowerofTwo231 {
    public boolean isPowerOfTwo(int n) {
        if (n==0)
            return false;
        while (n%2==0){
            n/=2;
        }
        return n==1;
    }
}
