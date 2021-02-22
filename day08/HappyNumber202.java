package day08;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/19 2:51
 * @Version 1.0
 */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        int slow = squaresum(n);
        int fast = squaresum(squaresum(n));
        while (slow!=fast){
            slow=squaresum(slow);
            fast=squaresum(squaresum(fast));
        }
        return slow==1;
    }
    int squaresum(int x){
        int temp=0;
        while (x!=0){
            temp+=(int) Math.pow(x%10,2);
            x/=10;
        }
        return temp;
    }
}
