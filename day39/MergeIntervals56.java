package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/24 17:40
 * @Version 1.0
 */
public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1)
            return intervals;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]>o2[0])
                    return 1;
                else if (o1[0]==o2[0])
                    return 0;
                else
                    return -1;
            }
        });
        int len = intervals.length;
        int i=0;
        while (i<len){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (i<len-1&&end>=intervals[i+1][0]){
                end = Math.max(end,intervals[i+1][1]);
                i++;
            }
            ans.add(new int[]{start,end});
            i++;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
