package day31;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/16 15:25
 * @Version 1.0
 */
public class SpiralMatrix_II59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int x_step = 1;
        int y_step = 0;
        int i = 0;
        int j = 0;
        int count = 1;
        while (count<=n*n){
            while (j>=0&&j<n&&i>=0&&i<n&&ans[j][i]==0){
                ans[j][i]=count++;
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
}
