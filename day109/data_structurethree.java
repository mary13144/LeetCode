package day109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/7/7 13:39
 * @Version 1.0
 */
public class data_structurethree {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (i<len1&&j<len2){
            if (nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int[] ansture = new int[ans.size()];
        for (int k = 0;k<ans.size();k++){
            ansture[k]=ans.get(k);
        }
        return ansture;
    }


    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int x:prices){
            if (x<min){
                min=x;
            }else {
                int flag = x-min;
                if (flag>ans)
                    ans=flag;
            }
        }
        return ans;
    }
}
