package day33;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/18 19:39
 * @Version 1.0
 */
public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=binarysearch(nums,target,true);
        ans[1]=binarysearch(nums,target,false);
        return ans;
    }

    public int binarysearch(int[] nums,int target,boolean leftorright){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                ans=mid;
                if (leftorright==true)
                    right=mid-1;
                else
                    left=mid+1;
            }
            if (nums[mid]<target){
                left=mid+1;
            }
            if (nums[mid]>target){
                right=mid-1;
            }
        }
        return ans;
//        if (leftorright==true){
//            if (left<nums.length&&nums[left]==target)
//                return left;
//            else
//                return -1;
//        }else {
//            if (right>=0&&nums[right]==target)
//                return right;
//            else
//                return -1;
//        }
    }

    public static void main(String[] args) {
        FindFirstandLastPositionofElementinSortedArray34 test = new FindFirstandLastPositionofElementinSortedArray34();
        int[] ints = test.searchRange(new int[]{1, 3}, 1);
    }
}
