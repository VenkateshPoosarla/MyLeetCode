/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode succe;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorderSuccessor1(root,p);
        return succe;
    }
    void inorderSuccessor1(TreeNode root, TreeNode p) {
        if(root==null) return;
        inorderSuccessor1(root.left,p);
        if(root.val>p.val&&succe==null) {succe=root;return;}
        inorderSuccessor1(root.right,p);
    }
    
}