package day15;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/26 1:10
 * @Version 1.0
 */

public class GuessNumberHigherorLower374 {
    //防止编译器报错
    int guess(int num){
        return 1;
    }
    public int guessNumber(int n) {
        if (n==1)
            return 1;
        int low=1,high=n;
        int mid;
        while (low<=high){
            mid=low+(high-low)/2;
            if (guess(mid)==0)
                return mid;
            if (guess(mid)==1)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}
