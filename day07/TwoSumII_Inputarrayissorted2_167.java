package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 1:57
 * @Version 1.0
 */
public class TwoSumII_Inputarrayissorted2_167 {
    public int[] twoSum(int[] numbers, int target) {
        int mid,sum = 0;
        for (int i = 0;i<numbers.length;i++){
            int left = i+1;
            int right = numbers.length-1;
            sum=target-numbers[i];
            while (left<=right){
                mid=left+(right-left)/2;
                if (numbers[mid]==sum)
                    return new int[]{i+1,mid+1};
                else if (numbers[mid]>sum)
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        return null;
    }
}
