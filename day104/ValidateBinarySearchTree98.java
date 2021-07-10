package day104;

import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/19 22:06
 * @Version 1.0
 */
public class ValidateBinarySearchTree98 {
    //递归中序遍历
//    Stack<Integer> flag = new Stack<>();
//    boolean ans = true;
//    public boolean isValidBST(TreeNode root) {
//        dfssearchtree(root);
//        return ans;
//    }
//    public void dfssearchtree(TreeNode root){
//        if (root==null)
//            return;
//        dfssearchtree(root.left);
//        if (!flag.empty()){
//            if (root.val<=flag.peek())
//                ans=false;
//        }
//        flag.push(root.val);
//        dfssearchtree(root.right);
//    }
    //迭代中序遍历
//    public boolean isValidBST(TreeNode root) {
//        Stack<TreeNode> flag = new Stack<>();
//        long pre =Long.MIN_VALUE;
//        while (root!=null||!flag.empty()){
//            while (root!=null){
//                flag.push(root);
//                root=root.left;
//            }
//            root=flag.pop();
//            if (pre>=root.val)
//                return false;
//            pre=root.val;
//            root=root.right;
//        }
//        return true;
//    }

    //递归区间法
}
