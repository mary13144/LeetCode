package day29;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/14 19:35
 * @Version 1.0
 */
public class FibonacciNumber509 {
    //递归
//    public int fib(int n) {
//        if (n==0)
//            return 0;
//        if (n==1)
//            return 1;
//        return fib(n-1)+fib(n-2);
//    }
    public int fib(int n) {
        if (n==0||n==1)
            return n;
        int p = 0,q = 1;
        int ans = 0;
        for (int i = 2;i<=n;i++){
            ans = p+q;
            p=q;
            q=ans;
        }
        return ans;
    }
}
