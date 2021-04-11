package day50;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/4 12:49
 * @Version 1.0
 */
public class RabbitsinForest761 {
    public int numRabbits(int[] answers) {
        if (answers.length==0)
            return 0;
        Arrays.sort(answers);
        int ans = answers[0]+1;
        int flag = answers[0];
        int count = 0;
        for (int i = 1;i<answers.length;i++){
            if (answers[i]==flag){
                count++;
                if (count>flag){
                    count=0;
                    ans+=flag+1;
                }
            }else {
                count=0;
                flag=answers[i];
                ans+=flag+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RabbitsinForest761 test = new RabbitsinForest761();
        test.numRabbits(new int[]{1,0,1,0,0});
    }
}
