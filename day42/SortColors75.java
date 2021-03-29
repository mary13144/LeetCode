package day42;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/27 15:44
 * @Version 1.0
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = 0;
        while (k<n){
            if (k<i)
                k=i;
            if (k>j)
                break;
            if (nums[k]==0){
                swap(nums,i,k);
                i++;
            }else if (nums[k]==2){
                swap(nums,j,k);
                j--;
            }else {
                k++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int flag = nums[i];
        nums[i]=nums[j];
        nums[j]=flag;
    }
}
