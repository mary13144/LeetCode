package day53;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/7 23:01
 * @Version 1.0
 */
public class FindMinimuminRotatedSortedArray153 {
    public int findMin(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid!=left&&mid!=right){
                if (nums[mid]<nums[mid-1]&&nums[mid]<nums[mid+1])
                    return nums[mid];
            }else{
                return Math.min(nums[right],nums[left]);
            }
            if (nums[mid]<=nums[right])
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}
