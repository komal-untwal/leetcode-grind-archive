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
     List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
     
        if(root == null) return res;
        helper(root,0);
        return res;
            
    }
    
    public void helper(TreeNode root,int level)
    {
        if(res.size() == level)
        {
            res.add(new ArrayList<Integer>());
        }
        
        res.get(level).add(root.val);
        
        if(root.left != null)
            helper(root.left,level+1);
        
        if(root.right != null)
            helper(root.right,level+1);
    }
}
