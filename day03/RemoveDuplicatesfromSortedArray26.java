package day03;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/13 22:48
 * @Version 1.0
 */
public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int q=0;
        int p=1;
        while (p<nums.length){
            if (nums[q]!=nums[p]){
                nums[q+1]=nums[p];
                q++;
            }
            p++;
        }
        return q;

    }

    public static void main(String[] args) {
        int[] x= new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray26 test = new RemoveDuplicatesfromSortedArray26();
        int i = test.removeDuplicates(x);
        System.out.println(i);
    }
}
