package day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 16:50
 * @Version 1.0
 */
public class BinaryWatch1_401 {
    List<String> ans = new ArrayList<>();
    int[] watch = new int[]{8,4,2,1,32,16,8,4,2,1};
    //回溯法
    public List<String> readBinaryWatch(int num) {
        dfswatch(num,0,0,0,0);
        return ans;
    }
    void dfswatch(int num,int count,int index,int hour,int minute){
        if (hour>11||minute>59)
            return;
        if (count==num){
            ans.add(hour+":"+(minute<10?"0"+minute:minute));
            return;
        }
        if (index>=watch.length)
            return;
        dfswatch(num,count,index+1,hour,minute);
        if (index<=3)
            hour+=watch[index];
        else
            minute+=watch[index];
        dfswatch(num,count+1,index+1,hour,minute);
    }
}
