/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "#";
        return root.val+","+serialize(root.left)+","+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> qu=new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(qu);
    }
    TreeNode helper(Queue<String> qu){
        String str=qu.poll();
        if(str.equals("#")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(str));
        root.left=helper(qu);
        root.right=helper(qu);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));