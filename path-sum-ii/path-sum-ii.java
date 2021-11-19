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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
      List<List<Integer>> li=new ArrayList<>();
        if(root==null) return li;
        List<Integer> temp=new ArrayList<>();
        temp.add(root.val);
        
        pathSum(root,targetSum-root.val,li,temp);
        return li;
    }
    public void pathSum(TreeNode root, int targetSum,List<List<Integer>> li,List<Integer> temp) {
        if(targetSum==0 && root.left==null &&  root.right==null){
            li.add(new ArrayList<>(temp));
        }
        if(root.left!=null )
        {
            temp.add(root.left.val);
            pathSum(root.left,targetSum-root.left.val,li,temp);
            temp.remove(temp.size()-1);
        }
        if(root.right!=null )
        {
            temp.add(root.right.val);
            pathSum(root.right,targetSum-root.right.val,li,temp);
            temp.remove(temp.size()-1);
        }
    }
}