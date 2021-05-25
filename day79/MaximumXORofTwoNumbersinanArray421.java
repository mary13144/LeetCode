package day79;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/16 14:21
 * @Version 1.0
 */
public class MaximumXORofTwoNumbersinanArray421 {
    class Trie {
         Trie[] children = new Trie[2];
    }
    Trie note = new Trie();
    public void add(int x) {
        Trie p = note;
        for (int i = 31; i >=0; i--) {
            int a = (x >> i) & 1;
            if (p.children[a] == null) {
                p.children[a] = new Trie();
            }
            p = p.children[a];
        }
    }

    public int getval(int x){
        int ans = 0;
        Trie p = note;
        for (int i = 31;i>=0;i--){
            int a = (x>>i)&1;
            int b = 1-a;
            if (p.children[b]!=null){
                ans|=(b<<i);
                p=p.children[b];
            }else {
                ans|=(a<<i);
                p=p.children[a];
            }
        }
        return ans;
    }
    public int findMaximumXOR(int[] nums) {
        int ans = 0;
        for (int x:nums){
            add(x);
            int temp = getval(x);
            ans=Math.max(ans,x^temp);
        }
        return ans;
    }
}
