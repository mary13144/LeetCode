package day33;


/**
 * @Author Mu Wenxin
 * @Date 2021/3/18 15:22
 * @Version 1.0
 */
public class SearchinRotatedSortedArray33 {
    //非递归二分法
//    public int search(int[] nums, int target) {
//        int len = nums.length;
//        int left = 0;
//        int right = len-1;
//        while (left<=right){
//            int mid = left+(right-left)/2;
//            if (nums[mid]==target)
//                return mid;
//            if (nums[mid]<nums[right]){
//                if (target>nums[mid]&&target<=nums[right]){
//                    left=mid+1;
//                }else {
//                    right=mid-1;
//                }
//            }else {
//                if (target<nums[mid]&&target>=nums[left]){
//                    right=mid-1;
//                }else {
//                    left=mid+1;
//                }
//            }
//        }
//        return -1;
//    }

    //递归
    public int search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length-1,target);
    }
    public int binarysearch(int[] nums,int left,int right,int target){
        if (left>right)
            return -1;
        int mid = left + (right-left)/2;
        if (nums[mid]==target)
            return mid;
        if (nums[mid]<nums[right]){
            if (target>nums[mid]&&target<=nums[right])
                return binarysearch(nums,mid+1,right,target);
            else
                return binarysearch(nums,left,mid-1,target);
        }else {
            if (target<nums[mid]&&target>=nums[left])
                return binarysearch(nums,left,mid-1,target);
            else
                return binarysearch(nums,mid+1,right,target);
        }
    }
}
