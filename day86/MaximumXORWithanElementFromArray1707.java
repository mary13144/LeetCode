package day86;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/23 15:38
 * @Version 1.0
 */
public class MaximumXORWithanElementFromArray1707 {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        Map<int[],Integer> map = new HashMap<>();
        for (int i = 0;i<queries.length;i++){
            map.put(queries[i],i);
        }
        Arrays.sort(nums);
        Arrays.sort(queries, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int index = 0;
        for (int[] q:queries){
            int target = q[0];
            int max = q[1];
            while (index<nums.length&&nums[index]<=max){
                add(nums[index++]);
            }
            if (index==0)
                ans[map.get(q)]=-1;
            else
                ans[map.get(q)]=getval(target);
        }
        return ans;
    }
    class Trie{
        Trie[] children = new Trie[2];
    }
    Trie root = new Trie();
    public void add(int x){
        Trie node = root;
        for (int i = 31;i>=0;i--){
            int a = (x>>i)&1;
            if (node.children[a]==null)
                node.children[a]=new Trie();
            node=node.children[a];
        }
    }

    public int getval(int x){
        int ans = 0;
        Trie node = root;
        for (int i = 31;i>=0;i--){
            int a = (x>>i)&1;
            int b = 1-a;
            if (node.children[b]==null){
                ans|=(a<<i);
                node=node.children[a];
            }else {
                ans|=(b<<i);
                node=node.children[b];
            }
        }
        return ans^x;
    }
}
