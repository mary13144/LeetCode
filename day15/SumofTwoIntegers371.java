package day15;

import com.sun.jmx.snmp.SnmpUnsignedInt;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/26 0:21
 * @Version 1.0
 */
public class SumofTwoIntegers371 {
    public int getSum(int a, int b) {
        if (a==0)
            return b;
        if (b==0)
            return a;
        int low,high;
        while (true){
            low = a^b;
            high = a&b;
            if (high==0)
                break;
            a=low;
            b=high<<1;
        }
        return low;
    }
}
