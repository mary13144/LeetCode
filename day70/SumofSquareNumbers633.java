package day70;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/28 11:01
 * @Version 1.0
 */
public class SumofSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left<=right){
            int sum = left*left+right*right;
            if (sum==c)
                return true;
            else if (sum<c){
                left++;
            }else
                right--;
        }
        return false;
    }
}
