package day110;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/7/8 16:07
 * @Version 1.0
 */
public class data_structurefour {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int len = mat.length;
        int len1 = mat[0].length;
        if (len*len1!=r*c)
            return mat;
        int r1 = 0;
        int c1 = 0;
        int[][] ans = new int[r][c];
        for (int i = 0;i<len;i++){
            for (int j = 0;j<len1;j++){
                if (c1==c){
                    c1=0;
                    r1++;
                }
                ans[r1][c1]=mat[i][j];
                c1++;
            }
        }
        return ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            List<Integer> flag = new ArrayList<>();
            flag.add(1);
            for (int j = 1;j<=i;j++){
                if (j==i)
                    flag.add(1);
                else
                    flag.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans.add(new ArrayList<>(flag));
        }
        return ans;
    }
}
