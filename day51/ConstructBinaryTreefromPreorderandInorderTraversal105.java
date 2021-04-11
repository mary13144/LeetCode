package day51;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/5 16:23
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
public class ConstructBinaryTreefromPreorderandInorderTraversal105 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return butree(preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode butree(int[] preorder,int[] inorder,int i ,int j,int m,int n){
        if (i>j)
            return null;
        TreeNode root = new TreeNode(preorder[i]);
        int flag = m;
        while (flag<=n){
            if (inorder[flag]==root.val)
                break;
            flag++;
        }
//        int flag = map.get(root.val);
        int len = flag-m;
        root.left=butree(preorder,inorder,i+1,i+len,m,flag-1);
        root.right=butree(preorder,inorder,i+len+1,j,flag+1,n);
        return root;
    }
}
