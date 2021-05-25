package day63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/19 9:17
 * @Version 1.0
 */
public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (n==1){
            ans.add(nums[0]);
            return ans;
        }
        if (n==2){
            ans.add(nums[0]);
            if (nums[1]!=nums[0])
                ans.add(nums[1]);
            return ans;
        }
        int temp=n/3;
        Arrays.sort(nums);
        int flagnum = 1;
        int pre = nums[0];
        int i=1;
        while (i<n){
            if (nums[i]==pre){
                flagnum++;
                if (flagnum>temp){
                    ans.add(nums[i-1]);
                    while (i<n&&nums[i]==pre){
                        i++;
                    }
                    if (i==n)
                        break;
                    pre=nums[i];
                    flagnum=1;
                }
            }else{
                pre=nums[i];
                flagnum=1;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        MajorityElementII229 test = new MajorityElementII229();
        List<Integer> integers = test.majorityElement(new int[]{0,0,0});
        System.out.println(integers.toString());
    }
}
