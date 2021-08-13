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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root==null) new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        li.add(root.val);
        addLeftNodes(root.left,li);
        
        addLeafNodes(root.left,li);
        addLeafNodes(root.right,li);
        
        addRightNodes(root.right,li);
        return li;
    }
    
    void addRightNodes(TreeNode root ,List<Integer> li){
        if(root==null) return;
        if(root.right!=null){
            addRightNodes(root.right,li);
            li.add(root.val);
        }else if(root.left!=null){
            addRightNodes(root.left,li);
            li.add(root.val);
        }
        return;
    }
    
    void addLeftNodes(TreeNode root ,List<Integer> li){
        if(root==null) return;
        if(root.left!=null){
            li.add(root.val);
            addLeftNodes(root.left,li);
        }else if(root.right!=null){
            li.add(root.val);
            addLeftNodes(root.right,li);
        }
        return;
    }
    void addLeafNodes(TreeNode root ,List<Integer> li){
        if(root==null) return;
        addLeafNodes(root.left,li);
        if(root.left==null && root.right==null) li.add(root.val);
        addLeafNodes(root.right,li);
    }
}