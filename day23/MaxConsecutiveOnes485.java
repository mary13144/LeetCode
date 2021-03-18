package day23;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/8 14:50
 * @Version 1.0
 */
public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                count++;
            }
            if (i!=nums.length-1&&nums[i]==0){
                if (count>ans)
                    ans=count;
                count=0;
            }
            if (i==nums.length-1){
                if (count>ans)
                    ans=count;
            }
        }
        return ans;
    }
}
