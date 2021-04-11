package day56;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/10 15:07
 * @Version 1.0
 */
public class RotateArray189 {
    //翻转（判断耗时很长）
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k%=n;
//        reversenums(nums,0,n-1);
//        reversenums(nums,0,k-1);
//        reversenums(nums,k,n-1);
//    }
//    public void reversenums(int[] nums ,int start,int end){
//        while (start<end){
//            int flag = nums[start];
//            nums[start++]=nums[end];
//            nums[end--]=flag;
//        }
//    }
    //双重循环（超时）
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        for (int i=0;i<k;i++){
//            int temp = nums[n-1];
//            for (int j = n-1;j>0;j--){
//                nums[j]=nums[j-1];
//            }
//            nums[0]=temp;
//        }
//    }
    //官方题解环状替换
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int count = gcd(k, n);
            for (int start = 0; start < count; ++start) {
                int current = start;
                int prev = nums[start];
                do {
                    int next = (current + k) % n;
                    int temp = nums[next];
                    nums[next] = prev;
                    prev = temp;
                    current = next;
                } while (start != current);
            }
        }
        public int gcd(int x, int y) {
            return y > 0 ? gcd(y, x % y) : x;
        }
    public static void main(String[] args) {
        RotateArray189 test = new RotateArray189();
        test.rotate(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27},38);
    }
}
