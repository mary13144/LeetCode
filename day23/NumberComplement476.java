package day23;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/8 13:22
 * @Version 1.0
 */
public class NumberComplement476 {
    int findComplement(int num) {
        if (num==0)
            return 1;
        int ans = 0;
        int flag=num;
        while (flag>0){
            flag=flag>>1;
            ans=(ans<<1)+1;
        }
        return num^ans;
    }
}
