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
    int totalGoodNodes = 0;
    public int goodNodes(TreeNode root) {
        
        dfs(root , root.val);
        return totalGoodNodes;





    }

    public void dfs (TreeNode node , int maxSoFar) {

        if (node == null){
            return;
        }
    
        if (node.val >= maxSoFar) {
            totalGoodNodes++; 
        }
        int newMax = Math.max(maxSoFar, node.val);
     
        dfs(node.left, newMax);
        dfs(node.right, newMax);
        

    }
}
