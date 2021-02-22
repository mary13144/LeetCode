package day06;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 23:56
 * @Version 1.0
 */

class TreeNode1 {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        else if (root.left==null&&root.right==null)
            return 1;
        else if (root.left==null&&root.right!=null)
            return minDepth(root.right)+1;
        else if (root.left!=null&&root.right==null)
            return minDepth(root.left)+1;
        else
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
