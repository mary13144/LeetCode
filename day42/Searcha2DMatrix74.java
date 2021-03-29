package day42;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/27 14:54
 * @Version 1.0
 */
public class Searcha2DMatrix74 {
    //这个题用二分也行，感觉差距不大
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        while (i<m-1){
            if (target>=matrix[i][0]&&target<matrix[i+1][0])
                break;
            i++;
        }
        for (int j = 0;j<n;j++){
            if (matrix[i][j]==target)
                return true;
        }
        return false;
    }
}
