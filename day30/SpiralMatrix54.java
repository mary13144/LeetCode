package day30;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/15 23:50
 * @Version 1.0
 */
public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int x_step = 1;
        int y_step = 0;
        int i = 0;
        int j = 0;
        while (true){
            if (ans.size()==m*n)
                break;
            while (i>=0&&i<n&&j>=0&&j<m&&matrix[j][i]!=101){
                ans.add(matrix[j][i]);
                matrix[j][i]=101;
                i+=x_step;
                j+=y_step;
            }
            i-=x_step;
            j-=y_step;
            if (x_step>0){
                x_step=0;
                y_step=1;
            }else if (y_step>0){
                x_step=-1;
                y_step=0;
            }else if (x_step<0){
                x_step=0;
                y_step=-1;
            }else if (y_step<0){
                x_step=1;
                y_step=0;
            }
            i+=x_step;
            j+=y_step;
        }
        return ans;
    }

    public static void main(String[] args) {
        SpiralMatrix54 test = new SpiralMatrix54();
        List<Integer> list = test.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(list);
    }
}
