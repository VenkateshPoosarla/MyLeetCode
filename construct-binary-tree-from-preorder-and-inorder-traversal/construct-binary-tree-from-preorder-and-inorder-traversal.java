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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=constructTree(preorder,map,0,preorder.length-1);
        return root;
    }
    TreeNode constructTree(int[] preorder,Map<Integer,Integer> map,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=preorder[index++];
        TreeNode root=new TreeNode(rootval);
        root.left=constructTree(preorder,map,left,map.get(rootval)-1);
        root.right=constructTree(preorder,map,map.get(rootval)+1,right);
        return root;
    }
}