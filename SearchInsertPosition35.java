package day04;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/14 22:33
 * @Version 1.0
 */
public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (target<nums[mid]){
                right=mid-1;
            }
            if (target>nums[mid]){
                left=mid+1;
            }
            if (target==nums[mid])
                return mid;
        }
        return left;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        SearchInsertPosition35 test = new SearchInsertPosition35();
        int i = test.searchInsert(nums, target);
        System.out.println(i);
    }
}
