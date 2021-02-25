package day13;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/24 2:03
 * @Version 1.0
 */
public class PowerofThree326 {
    public boolean isPowerOfThree(int n) {
        if (n<1)
            return false;
        boolean flag;
        while (n!=1){
            flag=false;
            if (n%3==0){
                n/=3;
                flag=true;
            }
            if (flag==false)
                return false;
        }
        return true;
    }
}
