package day17;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 17:35
 * @Version 1.0
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class SumofLeftLeaves404 {
     public int sumOfLeftLeaves(TreeNode root) {
        if (root==null)
            return 0;
        int ans = 0;
        if (root.left!=null&&root.left.left==null&&root.left.right==null)
            ans+=root.left.val;
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+ans;
     }
}
