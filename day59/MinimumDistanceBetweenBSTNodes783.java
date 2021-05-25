package day59;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/13 15:34
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
public class MinimumDistanceBetweenBSTNodes783 {
    int ans = Integer.MAX_VALUE;
    int pre = 0;
    int flag = 0;
    public int minDiffInBST(TreeNode root) {
        dfstree(root);
        return ans;
    }
    public void dfstree(TreeNode root){
        if (root==null)
            return;
        dfstree(root.left);
        if (flag==0){
            flag++;
            pre=root.val;
        }else {
            int temp = root.val-pre;
            if (temp<ans)
                ans=temp;
            pre=root.val;
        }
        dfstree(root.right);
    }
}
