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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        //if (root == null) return res;
        q.add(root);
        
        while(q.isEmpty() == false)
        {
            int size = q.size();
            //List<Integer> sub_res = new LinkedList<>();
            double sum = 0;
            //Double avg = 0.0;
            for(int i=0; i<size; i++)
            {
                TreeNode first = q.poll();
                //sub_res.add(first.val);
                sum += first.val;
                
                if(first.left != null) q.add(first.left);
                if(first.right != null) q.add(first.right);
                    
            }
            //avg = ;
            res.add(sum/size);
        }
        return res;  
    }
}
