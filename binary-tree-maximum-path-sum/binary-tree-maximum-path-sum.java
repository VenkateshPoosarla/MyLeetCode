/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxpath=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
           maxPath(root);
           return maxpath;
    }
    int maxPath(TreeNode root) {
        if(root==null) return Integer.MIN_VALUE;
        int val=root.val;
        int left=Math.max(maxPath(root.left),0);
        int right=Math.max(maxPath(root.right),0);
        maxpath=Math.max(left+val+right,maxpath);
        
        return val+Math.max(left,right);
    }
}