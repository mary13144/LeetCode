package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/16 16:58
 * @Version 1.0
 */
public class threeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0;i<len;i++){
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int target = -nums[i];
            int start = i+1;
            int end = len-1;
            while (start<end){
                if (start<end&&nums[start]+nums[end]==target){
                    List<Integer> flag = new ArrayList<>();
                    flag.add(nums[i]);
                    flag.add(nums[start]);
                    flag.add(nums[end]);
                    ans.add(flag);
                    start++;
                    while (start<end){
                        if (nums[start]==nums[start-1])
                            start++;
                        else
                            break;
                    }
                }
                if (nums[start]+nums[end]>target){
                        end--;
                    while (start<end&&nums[end]==nums[end+1]){
                        end--;
                    }
                }
                if (nums[start]+nums[end]<target){
                        start++;
                    while (start<end&&nums[start]==nums[start-1]){
                        start++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        threeSum15 test = new threeSum15();
        List<List<Integer>> lists = test.threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0});
        System.out.println(lists);
    }
}
