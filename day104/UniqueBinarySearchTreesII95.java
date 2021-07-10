package day104;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/19 12:59
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
public class UniqueBinarySearchTreesII95 {
    public List<TreeNode> generateTrees(int n) {
        if (n!=0){
            return dfstree(1,n);
        }else
            return new ArrayList<>();
    }
    public List<TreeNode> dfstree(int left,int right){
        List<TreeNode> ans = new LinkedList<>();
        if (left>right){
            ans.add(null);
            return ans;
        }
        for (int i = left;i<=right;i++){
            List<TreeNode> lefttree = dfstree(left,i-1);
            List<TreeNode> righttree = dfstree(i+1,right);
            for (TreeNode leftson:lefttree){
                for (TreeNode rightson:righttree){
                    TreeNode root = new TreeNode(i);
                    root.left=leftson;
                    root.right=rightson;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
