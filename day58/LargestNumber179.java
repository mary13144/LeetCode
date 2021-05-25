package day58;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/12 10:22
 * @Version 1.0
 */
public class LargestNumber179 {
    public String largestNumber(int[] nums) {

        //希尔排序（中等）
//        int n = nums.length;
//        int h = 1;
//        while (h<n/3){
//            h=3*h+1;
//        }
//        while (h>=1){
//            for (int i = h;i<n;i++){
//                for (int j = i;j>0;j-=h){
//                    String s1 = nums[j]+""+nums[j-1];
//                    String s2 = nums[j-1]+""+nums[j];
//                    if (Long.parseLong(s1)>Long.parseLong(s2)){
//                        int temp = nums[j];
//                        nums[j]=nums[j-1];
//                        nums[j-1]=temp;
//                    }
//                }
//            }
//            h=h/3;
//        }

                //插入排序（最慢）
//        for (int i = 1;i<nums.length;i++){
//            for (int j = i;j>0;j--){
//                String s1 = nums[j]+""+nums[j-1];
//                String s2 = nums[j-1]+""+nums[j];
//                if (Long.parseLong(s1)>Long.parseLong(s2)){
//                    int temp = nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                }
//            }
//        }
        //******************************************************************
        int n = nums.length;
        sortfast(nums,0,n-1);
        StringBuffer ans = new StringBuffer();
        for (int i = 0;i<n;i++){
            ans.append(nums[i]);
        }
        if (ans.charAt(0)=='0')
            return 0+"";
        return ans.toString();
    }


    //快排（最快）
    public void sortfast(int[] nums,int start,int end){
        if (start>end)
            return;
        int base = nums[start];
        int i = start;
        int j = end;
        while (i!=j){
            while (compare(nums[j],base)&&i<j){
                j--;
            }
            while (compare(base,nums[i])&&i<j){
                i++;
            }
            if (i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        nums[start]=nums[i];
        nums[i]=base;
        sortfast(nums,start,i-1);
        sortfast(nums,i+1,end);
    }

    //比较函数
    public boolean compare(int x,int j){
        String s1 = x+""+j;
        String s2 = j+""+x;
        if (Long.parseLong(s1)>Long.parseLong(s2))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        LargestNumber179 test = new LargestNumber179();
        String s = test.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(s);
    }
}
