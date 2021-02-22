package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 2:43
 * @Version 1.0
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        int ans=nums[0];
        int count = 1;
        for (int i =1;i<nums.length;i++){
            if (ans==nums[i]){
                count++;
            }else{
                count--;
            }
            if (count==0){
                ans=nums[i];
                count=1;
            }

        }
        return ans;
    }
}
