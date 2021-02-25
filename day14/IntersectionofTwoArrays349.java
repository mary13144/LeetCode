package day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/25 0:24
 * @Version 1.0
 */
public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length==0||nums2.length==0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i<nums1.length;i++){
            if (i>0&&nums1[i]==nums1[i-1])
                continue;
            if (isinsade(nums1[i],nums2)){
                set.add(nums1[i]);
            }
        }
        int[] finalresult = new int[set.size()];
        int i = 0;
        for (Integer obj:set){
            finalresult[i]=obj;
            i++;
        }
        return finalresult;
    }
    boolean isinsade(int a,int[] num){
        for (int i = 0;i<num.length;i++){
            if (num[i]==a)
                return true;
        }
        return false;
    }

}
