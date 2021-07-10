package day93;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author Mu Wenxin
 * @Date 2021/6/3 12:28
 * @Version 1.0
 */
public class ContiguousArray525 {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n+1];
        for (int i = 0;i<n;i++){
            if (nums[i]==0)
                nums[i]=-1;
            pre[i+1]=pre[i]+nums[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        int maxans = 0;
        for (int i = 2;i<=n;i++){
            if (!map.containsKey(pre[i-2])){
                map.put(pre[i-2],i-2);
            }
            if (map.containsKey(pre[i])){
                int flag = i-map.get(pre[i]);
                if (flag>maxans)
                    maxans=flag;
            }
        }
        return maxans;
    }
}
