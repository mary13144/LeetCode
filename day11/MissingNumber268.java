package day11;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 3:30
 * @Version 1.0
 */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        boolean[] ans = new boolean[nums.length+1];
        int i=0;
        while (i<nums.length){
            ans[nums[i]]=true;
            i++;
        }
        i=0;
        while (i<nums.length){
            if (ans[i]==false)
                break;
            i++;
        }
        return i;
    }
}
