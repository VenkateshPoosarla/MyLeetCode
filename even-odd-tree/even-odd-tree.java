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
    public boolean isEvenOddTree(TreeNode root) {
     int level=0;
      Queue<Pair<TreeNode,Integer>> qu=new LinkedList<>();
      qu.offer(new Pair<>(root,0));
        int prev=Integer.MIN_VALUE;
        int prevlevel=-1;
        boolean increasing=false;
      while(!qu.isEmpty()){
          Pair<TreeNode,Integer> out=qu.poll();
          level=out.getValue();
          if(level!=prevlevel){
              increasing=!increasing;
              prevlevel=level;
              prev=increasing?Integer.MIN_VALUE:Integer.MAX_VALUE;
          }
          if(increasing){
              if(prev>=out.getKey().val || out.getKey().val%2==0){
                  return false;
              }else{
                  prev=out.getKey().val;
              }
          }else{
               if(prev<=out.getKey().val ||  out.getKey().val%2==1){
                  return false;
              }else{
                  prev=out.getKey().val;
              }
          }
          TreeNode node=out.getKey();
          // System.out.println("hello");
          
          if(node.left!=null)
              qu.offer(new Pair(node.left,level+1));
          if(node.right!=null)
             qu.offer(new Pair(node.right,level+1));
      }
        return true;
    }
}