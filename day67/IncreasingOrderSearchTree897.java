package day67;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/25 10:38
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
public class IncreasingOrderSearchTree897 {
    TreeNode head = null;
    TreeNode pre = null;
    public TreeNode increasingBST(TreeNode root) {
        head=root;
        dfstree(root);
        return head;
    }
    public void dfstree(TreeNode root){
        if (root==null)
            return ;
        if (root.val<head.val)
            head=root;
        dfstree(root.left);
        if (pre==null){
            pre=head;
        } else {
            root.left=null;
            pre.right=root;
            pre=root;
        }
        dfstree(root.right);
    }
}
