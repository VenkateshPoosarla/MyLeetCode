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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
       int left=getLeft(root)+1; 
       int right=getRight(root)+1;
       if(left==right)
           return (2<<(left-1))-1;
        else
            return 1+countNodes(root.left)+countNodes(root.right);
    }
    int getRight(TreeNode root){
        if(root==null) return 0;
        int h=0;
        while(root.right!=null){
            root=root.right;
            h++;
        }
        return h;
    }
    int getLeft(TreeNode root){
        if(root==null) return 0;
        int h=0;
        while(root.left!=null){
            root=root.left;
            h++;
        }
        return h;
    }
}