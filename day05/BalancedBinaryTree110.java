package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 2:11
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
public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        return isbalancedtree(root.left,root.right);

    }
    public boolean isbalancedtree(TreeNode left,TreeNode right){
        if (left==null&&right==null)
            return true;
        if ((left==null||right==null)&&Math.abs(maxDepth1(left)-maxDepth1(right))<=1){
            return true;
        }
        if (Math.abs(maxDepth1(left)-maxDepth1(right))>1)
            return false;
        else
            return isbalancedtree(left.left,left.right)&&isbalancedtree(right.left,right.right);

    }
     public int maxDepth1(TreeNode root) {
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        else return Math.max(maxDepth1(root.left),maxDepth1(root.right))+1;
    }
}
