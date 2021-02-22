package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 1:29
 * @Version 1.0
 */
class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3() {}
    TreeNode3(int val) { this.val = val; }
    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode3 root) {
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        else return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
