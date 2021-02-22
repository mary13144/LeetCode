package day11;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 1:18
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
public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root==null)
            return ans;
        String str = new String();
        stringtreepath(root,str,ans);
        return ans;
    }
    public void stringtreepath(TreeNode root,String str,List<String> ans){
        if (root.right==null&&root.left==null){
            str+=root.val;
            ans.add(str);
            return;
        }
        str+=root.val+"->";
        if (root.left!=null)
        stringtreepath(root.left,str,ans);
        if (root.right!=null)
        stringtreepath(root.right,str,ans);
    }
}
