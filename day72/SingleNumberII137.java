package day72;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/2 18:46
 * @Version 1.0
 */
public class SingleNumberII137 {
    //有限自动机
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
