package day99;
import static java.lang.Math.*;
/**
 * @Author Mu Wenxin
 * @Date 2021/6/14 12:30
 * @Version 1.0
 */
public class MergeTripletstoFormTargetTriplet1899 {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int one = 0;
        int two = 0;
        int three = 0;
        int i = 0;
        int[] flag = new int[3];
        while (i<triplets.length){
            flag=triplets[i];
            if (flag[0]>target[0]||flag[1]>target[1]||flag[2]>target[2]){
                i++;
                continue;
            }
            one = max(one,flag[0]);
            two = max(two,flag[1]);
            three = max(three,flag[2]);
            i++;
        }
        return one==target[0]&&two==target[1]&&three==target[2];
    }
}
