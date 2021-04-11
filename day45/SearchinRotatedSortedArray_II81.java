package day45;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/30 13:22
 * @Version 1.0
 */
public class SearchinRotatedSortedArray_II81 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return true;
            }
            if (nums[left]==nums[right]){
                left++;
                continue;
            }
            if (nums[mid]<=nums[right]){
                if (target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }else {
                if (target<nums[mid]&&target>=nums[left]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchinRotatedSortedArray_II81 test = new SearchinRotatedSortedArray_II81();
        test.search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1},2);
    }
}
