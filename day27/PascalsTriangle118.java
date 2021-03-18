package day27;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/12 21:36
 * @Version 1.0
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            List<Integer> flag = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    flag.add(1);
                }else {
                    flag.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(flag);
        }
        return ans;
    }
}
