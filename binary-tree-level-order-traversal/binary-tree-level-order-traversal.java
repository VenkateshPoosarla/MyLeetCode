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
    class Node{
        int level;
        TreeNode root;
        public Node(TreeNode root,int level){
            this.level=level;
            this.root=root;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Node> qu=new LinkedList<>();
        if(root!=null)
            qu.add(new Node(root,0));
        List<List<Integer>> li=new ArrayList<>();
        while(!qu.isEmpty()){
            Node node=qu.poll();
            int level=node.level;
            if(li.size()==level){
                li.add(new ArrayList<Integer>());
            }
            li.get(level).add(node.root.val);
            if(node.root.left!=null)
                qu.offer(new Node(node.root.left,level+1));
            if(node.root.right!=null)
                qu.offer(new Node(node.root.right,level+1));
        }
        return li;
    }
}