package day75;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/12 19:11
 * @Version 1.0
 */
public class XORQueriesofaSubarray1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int len = queries.length;
        int[] flag = new int[n];
        flag[0]=arr[0];
        for (int i = 1;i<n;i++){
            flag[i]=flag[i-1]^arr[i];
        }
        int[] ans = new int[len];
        for (int i =0;i<len;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            if (start==0){
                ans[i]=flag[end];
            }else {
                ans[i]=flag[end]^flag[start-1];
            }
        }
        return ans;
    }
}
