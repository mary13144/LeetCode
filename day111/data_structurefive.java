package day111;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/7/9 9:43
 * @Version 1.0
 */
public class data_structurefive {
    public boolean isValidSudoku(char[][] board) {
        boolean[] row = new boolean[9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0;i<9;i++){
            Arrays.fill(row,false);
            for (int j = 0;j<9;j++){
                if (board[i][j]!='.'){
                    int num = board[i][j]-'1';
                    int flag = i/3*3+j/3;
                    if (row[num]||col[num][j]||box[flag][num])
                        return false;
                    else {
                        row[num]=true;
                        col[num][j]=true;
                        box[flag][num]=true;
                    }
                }
            }
        }
        return true;
    }

    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean col = false;
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0;i<r;i++){
            if (matrix[i][0]==0)
                row=true;
        }
        for (int j = 0;j<c;j++){
            if (matrix[0][j]==0)
                col=true;
        }
        for (int i = 1;i<r;i++){
            for (int j = 1;j<c;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1;i<r;i++){
            if (matrix[0][i]==0){
                for (int j = 1;j<c;j++){
                    matrix[j][i]=0;
                }
            }
        }
        for (int i = 1;i<c;i++){
            if (matrix[i][0]==0){
                for (int j = 1;j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
        if (row){
            for (int i = 0;i<r;i++){
                matrix[i][0]=0;
            }
        }
        if (col){
            for (int i = 0;i<c;i++){
                matrix[0][i]=0;
            }
        }
    }
}
