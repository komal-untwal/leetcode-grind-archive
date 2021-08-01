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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
    
    if(subRoot == null){
            return true;
        }else if(root == null){
            return false;
        }else if(root.val == subRoot.val){
            boolean result = isIdentical(root, subRoot);
            if(result)
                return true;
            else
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }else
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isIdentical(TreeNode s,TreeNode t)
    {
      if(s == null && t == null) return true;
      if (s ==null || t == null) return false;
        
        return (s.val == t.val) && isIdentical(s.left,t.left) && isIdentical(s.right,t.right);
        
        
    }
}
