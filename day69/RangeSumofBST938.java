package day69;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/27 20:29
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
public class RangeSumofBST938 {
    public int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfstree(root,low,high);
        return ans;
    }
    void dfstree(TreeNode root, int low, int high){
        if (root==null)
            return;
        dfstree(root.left,low,high);
        if (root.val<=high&&root.val>=low)
            ans+=root.val;
        dfstree(root.right,low,high);
    }
}
