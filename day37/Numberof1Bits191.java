package day37;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/22 20:03
 * @Version 1.0
 */
public class Numberof1Bits191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
