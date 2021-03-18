package day29;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/14 19:58
 * @Version 1.0
 */
public class FindtheWinnerofanArrayGame1535 {
    public int getWinner(int[] arr, int k) {
        if (k>=arr.length){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0;i<arr.length;i++){
            list.addLast(arr[i]);
        }
        int count = 0;
        int pre=Math.max(list.get(0),list.get(1));
        while (count<k){
            if (list.get(0)>list.get(1)){
                Integer remove = list.remove(1);
                list.addLast(remove);
            }else {
                Integer remove = list.remove(0);
                list.addLast(remove);
            }
            if (list.get(0)==pre)
                count++;
            else {
                pre=list.get(0);
                count=1;
            }
        }
        return pre;
    }
}
