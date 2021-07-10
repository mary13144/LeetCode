package day105;

import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/22 10:26
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
public class RecoverBinarySearchTree99 {
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre=null,t1=null,t2=null;
        while (root!=null||!stack.empty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if (pre!=null&&root.val<=pre.val){
                if (t1==null)
                    t1=pre;
                else
                    t2=root;
            }
            pre=root;
            root=root.right;
        }
        int x = t1.val;
        t1.val=t2.val;
        t2.val=x;
    }

}
