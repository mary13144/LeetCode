package day43;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/28 14:58
 * @Version 1.0
 */
public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                boolean flag = search(board,i,j,word,0);
                if (flag)
                    return true;
            }
        }
        return false;
    }
    public boolean search(char[][] board,int i,int j,String word,int n){
        if (board[i][j]!=word.charAt(n))
            return false;
        else if (n==word.length()-1)
            return true;
        char flag = board[i][j];
        board[i][j]='#';
        boolean result = false;
        int[][] step = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for (int[] dir:step){
            int newi=i+dir[0];
            int newj=j+dir[1];
            if (newi<board.length&&newi>=0&&newj<board[0].length&&newj>=0){
                boolean stepflag = search(board,newi,newj,word,n+1);
                if (stepflag){
                    result=true;
                    break;
                }
            }
        }
        board[i][j]=flag;
        return result;
    }
}
