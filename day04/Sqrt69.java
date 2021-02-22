package day04;



/**
 * @Author Mu Wenxin
 * @Date 2021/2/15 2:10
 * @Version 1.0
 */
public class Sqrt69 {
    public int mySqrt(int x) {
        long left=0;
        long right=x/2+1;
        long mid =0;
        long sq=0;
        while (left<right){
            mid = (left+right+1)/2;
            sq=mid*mid;
            if (sq==x)
                return (int) mid;
            if (sq<x)
                left=mid;
            if (sq>x)
                right=mid-1;
        }
        return (int) left;
    }

    public static void main(String[] args) {
        Sqrt69 test = new Sqrt69();
        int i = test.mySqrt(1);
        System.out.println(i);
    }
}
