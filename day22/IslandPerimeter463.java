package day22;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/5 0:49
 * @Version 1.0
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int flag=0;
        int pel=0;
        for (int i=0;i<grid.length;i++){
            for (int j = 0;j<grid[i].length;j++){
                if (grid[i][j]==1){
                    flag++;
                    if (j<grid[i].length-1&&grid[i][j+1]==1)
                        pel++;
                    if (i<grid.length-1&&grid[i+1][j]==1)
                        pel++;
                }

            }
        }
        return flag*4-pel*2;
    }
}
