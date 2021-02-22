package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/16 1:44
 * @Version 1.0
 */
 class TreeNode4 {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode4() {}
     TreeNode4(int val) { this.val = val; }
     TreeNode4(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
public class ConvertSortedArraytoBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return treeboth(nums,0,nums.length-1);
    }
    public TreeNode treeboth(int[] nums, int start, int end){
        if (start>end)
            return null;
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=treeboth(nums,start,mid-1);
        root.right=treeboth(nums,mid+1,end);
        return root;
    }
}
