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
    int height,diameter = 0;
    public int longestPath(TreeNode root){
       if(root == null){
        return 0;
       }
       int lh = longestPath(root.left);
       int rh = longestPath(root.right);
       diameter = Math.max(diameter,lh+rh);
       height = Math.max(lh,rh)+1;

       return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return diameter;
    }
}