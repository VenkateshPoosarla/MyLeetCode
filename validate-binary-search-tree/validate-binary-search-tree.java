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
    public boolean isValidBST(TreeNode root) {
        boolean [] isvalid=new boolean[1];
       isValidBST(root,new Stack<Integer>(),isvalid);
        return !isvalid[0];
    }
    void isValidBST(TreeNode root, Stack<Integer> stack,boolean []valid ){
        if(root==null) return ;
        isValidBST(root.left,stack,valid);
        if(!stack.isEmpty() && stack.peek()>=root.val) valid[0]=true;
        stack.push(root.val);
        isValidBST(root.right,stack,valid);
    }
}