package day08;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/19 2:34
 * @Version 1.0
 */
public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
            int count=0;
            while (n>=5){
                count+=n/5;
                n/=5;
            }
            return count;
    }
}
