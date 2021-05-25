package day87;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/24 12:31
 * @Version 1.0
 */
public class FindtheTownJudge997 {
    public int findJudge(int n, int[][] trust) {
        int[][] people = new int[n][2];
        for (int[] person:trust){
            int output = person[0];
            int input = person[1];
            people[output-1][0]++;
            people[input-1][1]++;
        }
        for (int i = 0;i<n;i++){
            if (people[i][0]==0&&people[i][1]==n-1)
                return i+1;
        }
        return -1;
    }
}
