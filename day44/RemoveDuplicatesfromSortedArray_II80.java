package day44;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/29 21:41
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedArray_II80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=2)
            return nums.length;
        int q = 1;
        int p = 2;
        int count = 0;
        while (p<nums.length){
            if (nums[p]!=nums[q]){
                nums[q+1]=nums[p];
                q++;
            }else if (nums[p]!=nums[q-1]){
                nums[q+1]=nums[p];
                q++;
            }
            p++;
        }
        return q+1;
    }
}
