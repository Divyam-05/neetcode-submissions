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
    public boolean isValidBST(TreeNode root) {
 return dfs(root,Long.MAX_VALUE ,Long.MIN_VALUE );
    }


     private boolean dfs(TreeNode node, long right , long left){

      if(node == null){
         return true;
         }

         if(!(node.val < right && node.val>left)){
            return false;
         }


            return dfs(node.left, node.val, left)
                && dfs(node.right, right, node.val);

        

     }
}
