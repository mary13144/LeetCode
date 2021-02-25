package day14;

import java.util.*;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/25 1:11
 * @Version 1.0
 */
public class IntersectionofTwoArrays_II350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length==0||nums2.length==0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int a,b;
        for (int i = 0,j=0;i<nums1.length&&j<nums2.length;){
            a=nums1[i];
            b=nums2[j];
            if (a==b){
                list.add(nums1[i]);
                i++;
                j++;
            }
            if (a<b){
                i++;
            }
            if (a>b){
                j++;
            }
        }
        int[] finalresult = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()){
            finalresult[i]=iterator.next();
            i++;
        }
        return finalresult;
    }
}
