package day102;

import java.util.*;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/17 9:26
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
public class BinaryTreeInorderTraversal94 {
//    List<Integer> ans = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        dfstree(root);
//        return ans;
//    }
//    void dfstree(TreeNode root){
//        if (root==null)
//            return;
//        dfstree(root.left);
//        ans.add(root.val);
//        dfstree(root.right);
//    }
      public List<Integer> inorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
          Deque<TreeNode> flag = new LinkedList<>();
          while (root!=null||!flag.isEmpty()){
              while (root!=null){
                  flag.push(root);
                  root=root.left;
              }
              root=flag.pop();
              ans.add(root.val);
              root=root.right;
          }
          return ans;
      }
}
