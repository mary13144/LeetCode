package day27;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/12 22:10
 * @Version 1.0
 */
public class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
      int[][] flag = new int[rowIndex+1][rowIndex+1];
      List<Integer> ans = new ArrayList<>();
      for (int i= 0;i<=rowIndex;i++){
          for (int j = 0;j<=i;j++){
              if (j==0||j==i){
                  flag[i][j]=1;
              }else {
                  flag[i][j]=flag[i-1][j-1]+flag[i-1][j];
              }
              if (i==rowIndex){
                  ans.add(flag[i][j]);
              }
          }
      }
      return ans;
    }
}
