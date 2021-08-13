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
        Stack<Integer> stack=new Stack<>();
        isValidBST(root,stack);
        int prev=stack.pop();
        while(!stack.isEmpty()){
            if(prev<=stack.peek()){
                return false;
            }else{
               prev=stack.pop(); 
            }
        }
        return true;
    }
    void isValidBST(TreeNode root, Stack<Integer> stack){
        if(root==null) return ;
        isValidBST(root.left,stack);
        stack.push(root.val);
        isValidBST(root.right,stack);
    }
}