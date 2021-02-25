package day14;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/25 1:44
 * @Version 1.0
 */
public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        if (num==1)
            return true;
        long low = 0;
        long high = num/2;
        long mid;
        long sum;
        while (low<=high){
            mid=low+(high-low)/2;
            sum=mid*mid;
            if (sum==num)
                return true;
            if (sum<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare367 test = new ValidPerfectSquare367();
        boolean perfectSquare = test.isPerfectSquare(808201);
        System.out.println(perfectSquare);
    }
}
