package day03;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/13 23:26
 * @Version 1.0
 */
public class Remove_Element27 {
    public int removeElement(int[] nums, int val) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int m=0;
        int n=0;
        while (n<nums.length){
            if (nums[n]!=val){
                nums[m]=nums[n];
                m++;
            }
            n++;
        }
        return m;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        Remove_Element27 test =new Remove_Element27();
        int i = test.removeElement(nums, val);
        System.out.println(i);
    }
}
