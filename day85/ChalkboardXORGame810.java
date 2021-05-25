package day85;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/22 11:13
 * @Version 1.0
 */
public class ChalkboardXORGame810 {
    public boolean xorGame(int[] nums) {
        int ans = 0;
        for (int x:nums){
            ans^=x;
        }
        if (ans==0||nums.length%2==0)
            return true;
        return false;
    }
}
