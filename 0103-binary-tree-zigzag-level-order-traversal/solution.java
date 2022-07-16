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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean toogle_leftToRight = true;
        if (root == null) return res;
        q.add(root);
        while(q.isEmpty() == false)
        {
            int size = q.size();
            List<Integer> sub_res = new LinkedList<>();
            for(int i=0; i<size; i++)
            {
                TreeNode first = q.poll();
                if(toogle_leftToRight)
                    sub_res.add(first.val);
                else 
                    sub_res.add(0,first.val);
                
                if(first.left != null) q.add(first.left);
                if(first.right != null) q.add(first.right);
                    
            }
            res.add(sub_res);
            toogle_leftToRight = !toogle_leftToRight;
        }
        return res;    
    }
}
