package day06;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/17 0:19
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
public class Path_Sum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)
            return false;
        if (root.right==null&&root.left==null)
            return targetSum-root.val==0;
        if (root.right!=null&&root.left==null)
            return hasPathSum(root.right,targetSum-root.val);
        else if (root.right==null&&root.left!=null)
            return hasPathSum(root.left,targetSum-root.val);
        else
            return hasPathSum(root.right,targetSum-root.val)||hasPathSum(root.left,targetSum-root.val);
    }
}
