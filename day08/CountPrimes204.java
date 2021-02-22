package day08;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/19 22:17
 * @Version 1.0
 */
public class CountPrimes204 {
    public int countPrimes(int n) {
        int count = 0;
       boolean[] flag = new boolean[n];
        Arrays.fill(flag,false);
        for (int i = 2; i<n;i++ ){
            if (!flag[i]){
                count++;
                if ((long)i*i<n){
                    for (int j=i*i;j<n;j=j+i)
                        flag[j]=true;
                }
            }
        }
        return count;
    }
}
