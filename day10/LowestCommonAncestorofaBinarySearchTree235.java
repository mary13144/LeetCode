package day10;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 0:13
 * @Version 1.0
 */
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class LowestCommonAncestorofaBinarySearchTree235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((p.val<=root.val&&q.val>= root.val)||(p.val>= root.val&&q.val<= root.val))
            return root;
        if (p.val< root.val&&q.val< root.val)
            return lowestCommonAncestor(root.left,p,q);
        if (p.val>root.val&&q.val> root.val)
            return lowestCommonAncestor(root.right,p,q);
        return null;
    }
}
