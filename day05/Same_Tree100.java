package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 1:02
 * @Version 1.0
 */

 class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
public class Same_Tree100 {
    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {
        if (p==null&&q==null)
            return true;
        if (p==null||q==null)
            return false;
        if (p.val!=q.val)
            return false;
        else
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
