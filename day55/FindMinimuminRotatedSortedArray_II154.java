package day55;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/9 20:03
 * @Version 1.0
 */
public class FindMinimuminRotatedSortedArray_II154 {
    public int findMin(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid!=right&&mid!=left){
                if (nums[mid]<nums[mid+1]&&nums[mid]<nums[mid-1])
                    return nums[mid];
            }else
                return Math.min(nums[left],nums[right]);
            if (nums[left]==nums[right]){
                left++;
                continue;
            }
            if (nums[mid]<=nums[right])
                right=mid;
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
