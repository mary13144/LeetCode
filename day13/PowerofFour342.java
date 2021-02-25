package day13;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/24 2:16
 * @Version 1.0
 */
public class PowerofFour342 {
    public boolean isPowerOfFour(int n) {
        if (n<1)
            return false;
        while (n%4==0){
            n/=4;
        }
        return n==1;
    }
}
