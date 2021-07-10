package day106;

import java.util.*;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/24 9:56
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
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root!=null)
            queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> flag = new ArrayList<>();
            for (int i = 0;i<n;i++){
                TreeNode treeNode = queue.poll();
                flag.add(treeNode.val);
                if (treeNode.left!=null)
                    queue.add(treeNode.left);
                if (treeNode.right!=null)
                    queue.add(treeNode.right);

            }
            ans.add(flag);
        }
        return ans;
    }
}
