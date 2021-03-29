package day36;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/21 15:59
 * @Version 1.0
 */
public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        boolean rowflag = false;
        boolean columnflag = false;
        int column = matrix.length;
        int row = matrix[0].length;
        for (int i = 0;i<column;i++){
            if (matrix[i][0]==0){
                columnflag=true;
                break;
            }
        }
        for (int i=0;i<row;i++){
            if (matrix[0][i]==0){
                rowflag=true;
                break;
            }
        }
        for (int i = 1;i<column;i++){
            for (int j = 1;j<row;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1;i<column;i++){
            if (matrix[i][0]==0){
                for (int j = 1;j<row;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 1;i<row;i++){
            if (matrix[0][i]==0){
                for (int j = 1;j<column;j++){
                    matrix[j][i]=0;
                }
            }
        }
        if (columnflag){
            for (int i = 0;i<column;i++){
                matrix[i][0]=0;
            }
        }
        if (rowflag){
            for (int i = 0;i<row;i++){
                matrix[0][i]=0;
            }
        }
    }
}
