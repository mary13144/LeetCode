package day100;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/15 12:40
 * @Version 1.0
 */
public class PeakIndexinaMountainArray852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left<right){
            mid = left+(right-left)/2;
            if (arr[mid]<arr[mid+1])
                left=mid+1;
            if (arr[mid]>arr[mid+1])
                right=mid;
        }
        return left;
    }
}
