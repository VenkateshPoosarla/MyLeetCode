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
     List<Integer> rightside = new ArrayList();
    
    public void helper(TreeNode node, int level) {
        if (level == rightside.size()) 
            rightside.add(node.val);
        
        if (node.right != null) 
            helper(node.right, level + 1);  
        if (node.left != null) 
            helper(node.left, level + 1);
    }    
    
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return rightside;
        
        helper(root, 0);
        return rightside;
    }
    
    // public List<Integer> rightSideView(TreeNode root) {
    //     Queue<Pair<Integer,TreeNode>> qu=new LinkedList<>();
    //     List<Integer> li=new ArrayList<>();
    //     if(root==null) return li;
    //     qu.add(new Pair<Integer,TreeNode>(0,root));
    //     while(!qu.isEmpty()){
    //        Pair<Integer,TreeNode> pa=qu.poll();
    //        TreeNode tn=pa.getValue();
    //        int level=pa.getKey();
    //        if(li.size()==level) li.add(tn.val);
    //         if(tn.right!=null)
    //              qu.add(new Pair<Integer,TreeNode>(level+1,tn.right));
    //         if(tn.left!=null)
    //            qu.add(new Pair<Integer,TreeNode>(level+1,tn.left));
    //     }
    //     return li;
    // }
}