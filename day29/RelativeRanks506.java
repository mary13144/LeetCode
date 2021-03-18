package day29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/14 18:33
 * @Version 1.0
 */
public class RelativeRanks506 {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        String[] ans = new String[score.length];
        if (score.length>=1){
            ans[map.get(score[score.length-1])]="Gold Medal";
        }
        if (score.length>=2){
            ans[map.get(score[score.length-2])]="Silver Medal";
        }
        if (score.length>=3){
            ans[map.get(score[score.length-3])]="Bronze Medal";
            for (int i = score.length-4,j=4;i>=0;i--,j++){
                ans[map.get(score[i])]=j+"";
            }
        }
        return ans;
    }
}
