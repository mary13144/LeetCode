package day11;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 2:51
 * @Version 1.0
 */
public class UglyNumber263 {
    public boolean isUgly(int num) {
        if (num==1)
            return true;
        if (num<=0)
            return false;
        int count = 0;
        while (num!=1){
            count=0;
            if (num%2==0){
                num/=2;
                count++;
            }
            if (num%3==0){
                num/=3;
                count++;
            }
            if (num%5==0){
                num/=5;
                count++;
            }
            if (count==0)
                return false;
        }
        return true;
    }
}
