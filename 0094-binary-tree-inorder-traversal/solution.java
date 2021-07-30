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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root,output);
        return output;
    }
    
    public void helper(TreeNode root, List<Integer> output)
    {
        TreeNode node = root;
        if(root != null)
        {
            if(root.left != null)
                helper(root.left,output);
            output.add(root.val);
            
            if(root.right != null)
                helper(root.right,output);
        }
    }
}
