package day29;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/14 19:13
 * @Version 1.0
 */
public class PerfectNumber507 {
    public boolean checkPerfectNumber(int num) {
        if (num<=1)
            return false;
        int sum = 1;
        for (int i = 2;i<Math.sqrt(num);i++){
            if (num%i==0){
                sum+=i;
                sum+=num/i;
            }
            if (sum>num)
                return false;
        }
        return num==sum;
    }

}
