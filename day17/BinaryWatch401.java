package day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 1:38
 * @Version 1.0
 */
public class BinaryWatch401 {
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<12;i++){
            for (int j = 0;j<60;j++){
                if (countone(i)+countone(j)==num)
                    ans.add(i+":"+(j<10?"0"+j:j));
            }
        }
        return ans;
    }

    int countone(int n){
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

}
