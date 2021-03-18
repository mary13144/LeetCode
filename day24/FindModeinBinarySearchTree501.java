package day24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/9 21:11
 * @Version 1.0
 */

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class FindModeinBinarySearchTree501 {
    int preval=Integer.MIN_VALUE;
    int curtimes=0;
    int maxtimes=0;
    List<Integer> ans = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        Traversal(root);
        int[] ruselt = new int[ans.size()];
        Iterator<Integer> iterator = ans.iterator();
        int i=0;
        while (iterator.hasNext()){
            ruselt[i]=iterator.next();
            i++;
        }
        return ruselt;
    }
    public void Traversal(TreeNode root){
        if (root!=null){
            Traversal(root.left);
            if (root.val==preval){
                curtimes++;
            }else {
                preval=root.val;
                curtimes=1;
            }
            if (curtimes==maxtimes){
                ans.add(root.val);
            }
            if (curtimes>maxtimes){
                maxtimes=curtimes;
                ans.clear();
                ans.add(root.val);
            }
            Traversal(root.right);
        }
    }
}
