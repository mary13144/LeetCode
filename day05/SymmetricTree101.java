package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 1:09
 * @Version 1.0
 */

class TreeNode2 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode3 root) {
        if (root==null)
            return true;
        return leftrightissame(root.left,root.right);
    }
    boolean leftrightissame(TreeNode3 left, TreeNode3 right){
        if (left==null&&right==null)
            return true;
        if (left==null||right==null)
            return false;
        if (left.val!=right.val)
            return false;
        else return leftrightissame(left.left,right.right)&&leftrightissame(left.right,right.left);
    }
}

