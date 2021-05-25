package day80;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/17 11:37
 * @Version 1.0
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class CousinsinBinaryTree993 {
    Set<Integer> flagdeep = new HashSet<>();
    Set<TreeNode> flagtree = new HashSet<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        dfstree(root,0,null,x,y);
        return flagtree.size()==2&&flagdeep.size()==1;
    }

    public void dfstree(TreeNode root,int deep,TreeNode pre,int x,int y){
        if (root==null)
            return;
        if (root.val==x|root.val==y){
            flagdeep.add(deep);
            flagtree.add(pre);
        }
        dfstree(root.left,deep+1,root,x,y);
        dfstree(root.right,deep+1,root,x,y);
    }
}
