package day37;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/22 20:41
 * @Version 1.0
 */
public class RotateImage48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0;i<(len+1)/2;i++){
            for (int j = i;j<len-1-i;j++){
                //column 和 row是用来后面方便旋转变换使用防止ij本身被改变
                int column = i;
                int row = j;
                //count 记录以每个坐标为基准的变换次数
                int count = 4;
                //flag1 flag2是临时变量储存变换中临时需要保存的数
                int flag1 = matrix[column][row];
                int flag2 = 0;
                while (count!=0){
                    count--;
                    flag2=matrix[row][len-1-column];
                    matrix[row][len-1-column]=flag1;
                    flag1=flag2;
                    int flag3 = column;
                    column=row;
                    row=len-1-flag3;
                }
            }
        }
    }
}
