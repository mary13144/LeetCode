package day11;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 2:37
 * @Version 1.0
 */
public class AddDigits258 {
    public int addDigits(int num) {
        if (num<10)
            return num;
        int ans = 0;
        while (num!=0){
            ans+=num%10;
            num/=10;
        }
        if (ans>=10)
            return addDigits(ans);
        return ans;
    }
}
