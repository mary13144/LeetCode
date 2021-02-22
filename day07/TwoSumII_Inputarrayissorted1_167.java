package day07;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/18 1:53
 * @Version 1.0
 */
public class TwoSumII_Inputarrayissorted1_167 {
    public int[] twoSum(int[] numbers, int target) {
        int  sum = 0;
        for (int i = 0, j = numbers.length-1;i<j;){
            sum = numbers[i]+numbers[j];
            if (sum==target)
                return new int[]{i+1,j+1};
            else if (sum>target)
                j--;
            else
                i++;
        }
        return null;
    }
}
