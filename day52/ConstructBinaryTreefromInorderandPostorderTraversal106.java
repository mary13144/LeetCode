package day52;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/6 15:32
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
public class ConstructBinaryTreefromInorderandPostorderTraversal106 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        for (int i = 0;i<n;i++){
            map.put(inorder[i],i);
        }
        return butree1(inorder,postorder,0,n-1,0,n-1);
    }
    public TreeNode butree1(int[] inorder, int[] postorder,int inorder_left,int inorder_right,int postorder_left,int postorder_right){
        if (inorder_left>inorder_right)
            return null;
        TreeNode root = new TreeNode(postorder[postorder_right]);
        int inorder_root = map.get(root.val);
        int len = inorder_root-inorder_left;
        root.left=butree1(inorder,postorder,inorder_left,inorder_root-1,postorder_left,postorder_left+len-1);
        root.right=butree1(inorder,postorder,inorder_root+1,inorder_right,postorder_left+len,postorder_right-1);
        return root;
    }
}
