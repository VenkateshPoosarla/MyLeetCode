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
    List<Integer> li=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        kthSmallest1(root,k); 
       return li.get(k-1);
    }
    public void kthSmallest1(TreeNode root, int k){
        if(root==null) return;
        if(k==li.size()) return;
        kthSmallest1(root.left,k);
        li.add(root.val);
        kthSmallest1(root.right,k);
    }
}