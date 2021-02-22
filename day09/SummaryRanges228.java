package day09;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/21 0:21
 * @Version 1.0
 */
public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length==0){
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        StringBuffer str = new StringBuffer();
        for (int i = 0;i<nums.length;i++){
            str.append(nums[i]);
            int x = i;
            while (i+1<nums.length&&nums[i+1]==nums[i]+1){
                i++;
            }
            if (i-x>=1){
                str.append("->");
                str.append(nums[i]);
                ans.add(str.toString());
                str=new StringBuffer();
            }else {
                ans.add(str.toString());
                str=new StringBuffer();
            }
        }
        return ans;
    }
}
