package day54;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/8 16:47
 * @Version 1.0
 */
public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        if (nums.length==1)
            return 0;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid!=left&&mid!=right){
                if (nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }
            }else {
                return nums[left]>nums[right]?left:right;
            }
            if (nums[mid]<nums[mid+1])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPeakElement162 test = new FindPeakElement162();
        int peakElement = test.findPeakElement(new int[]{2,1});
        System.out.println(peakElement);
    }
}
