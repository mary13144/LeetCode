package day46;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/31 17:18
 * @Version 1.0
 */
public class MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix1284 {
    int m ,n;
    int minstep = 10;
    int onenums = 0;
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int minFlips(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        for (int i=0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (mat[i][j]==1)
                    onenums++;
            }
        }
        dfsmat(mat,0,0,onenums,0);
        if (minstep==10)
            return -1;
        else {
            return minstep;
        }
    }
    public void dfsmat(int[][] mat,int i,int j,int ones,int count){
        if (j==n){
            j=0;
            i=i+1;
            dfsmat(mat,i,j,ones,count);
            return;
        }
        if (count>=minstep)
            return;
        if (ones==0){
            minstep=count;
            return;
        }
        if (i==m)
            return;
        int newones1=resmat(mat,i,j);
        dfsmat(mat,i,j+1,ones+newones1,count+1);
        resmat(mat,i,j);
        dfsmat(mat,i,j+1,ones,count);
    }
    public int resmat(int[][] mat,int i,int j){
        int newones = 0;
        if (mat[i][j]==1)
            newones--;
        else
            newones++;
        mat[i][j]=1-mat[i][j];
        for (int[] step:dir){
            int newi=i+step[0];
            int newj=j+step[1];
            if (newi<0||newi>=m||newj<0||newj>=n)
                continue;
            if (mat[newi][newj]==1)
                newones--;
            else
                newones++;
            mat[newi][newj]=1-mat[newi][newj];
        }
        return newones;
    }

    public static void main(String[] args) {
        MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix1284 test = new MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix1284();
        test.minFlips(new int[][]{{0,0},{0,1}});
    }
}
