package day05;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 0:18
 * @Version 1.0
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1=m-1;
        int len2=n-1;
        int len = m+n-1;
        while (len1>=0&&len2>=0){
            nums1[len--]=nums1[len1]>nums2[len2]?nums1[len1--]:nums2[len2--];
        }
        System.arraycopy(nums2,0,nums1,0,len2+1);
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        MergeSortedArray88 test = new MergeSortedArray88();
        test.merge(num1,3,num2,3);
        System.out.println(Arrays.toString(num1));
    }
}
