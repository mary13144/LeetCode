package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/24 20:56
 * @Version 1.0
 */
public class InsertInterval57 {
    //想法1进行插入，发现情况太多放弃
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        if (intervals.length==0)
//            return new int[][]{newInterval};
//        int len = intervals.length;
//        List<int[]> ans = new ArrayList<>();
//        int i = 0;
//        boolean flag = false;
//        while (i<len){
//            int start =i==0?Math.min(newInterval[0],intervals[i][0]):intervals[i][0];
//            int end = intervals[i][1];
//            if (end>=newInterval[0]){
//                flag=true;
//                if (i==0&&intervals[i][0]>newInterval[1]){
//                    ans.add(new int[]{newInterval[0],newInterval[1]});
//                    ans.add(new int[]{intervals[i][0],end});
//                    i++;
//                    continue;
//                }
//                end=Math.max(end,newInterval[1]);
//                if (end==newInterval[1]){
//                    while (i<len-1&&end>=intervals[i+1][0]){
//                        end=Math.max(end,intervals[i+1][1]);
//                        i++;
//                    }
//                }
//            }
//            ans.add(new int[]{start,end});
//            i++;
//        }
//        if (!flag)
//            ans.add(new int[]{newInterval[0],newInterval[1]});
//        return ans.toArray(new int[ans.size()][2]);

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int len = intervals.length;
        List<int[]> ans = new ArrayList<>();
        ans.add(new int[]{newInterval[0],newInterval[1]});
        int i=0;
        while (i<len){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int[][] ints = ans.toArray(new int[ans.size()][2]);
        ans.clear();
        Arrays.sort(ints, new Comparator<int[]>() {
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
        int n = ints.length;
        int j = 0;
        while (j<n){
            int start = ints[j][0];
            int end = ints[j][1];
            while (j<n-1&&end>=ints[j+1][0]){
                end=Math.max(end,ints[j+1][1]);
                j++;
            }
            ans.add(new int[]{start,end});
            j++;
        }
        return ans.toArray(new int[ans.size()][2]);
   }

    public static void main(String[] args) {
        InsertInterval57 test = new InsertInterval57();
        int[][] insert = test.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        System.out.println(insert);
    }
}
