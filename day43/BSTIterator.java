package day43;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/28 11:47
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
public class BSTIterator {
     //队列实现queue
//    Queue<TreeNode> queue = new LinkedList<>();
//    public BSTIterator(TreeNode root) {
//        initqueue(root);
//    }
//    public void initqueue(TreeNode head){
//        if (head==null)
//            return;
//        initqueue(head.left);
//        queue.offer(head);
//        initqueue(head.right);
//    }
//    public int next() {
//        return queue.poll().val;
//    }
//
//    public boolean hasNext() {
//        return !queue.isEmpty();
//    }

    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        while (root!=null){
            stack.push(root);
            root=root.left;
        }
    }

    public int next() {
        TreeNode root = stack.pop();
        int res = root.val;
        if (root.right!=null){
            root=root.right;
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
        }
        return res;
    }

    public boolean hasNext() {
        return !stack.empty();
    }
}
