/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode[] arr = new TreeNode[1];
        clone(arr,cloned,target);

        return arr[0];
    }
    public void clone(TreeNode arr[],TreeNode cl,TreeNode t){
        if(cl == null){
            return;
        }
        if(cl.val == t.val){
            arr[0] = cl;
            return;
        }
        clone(arr,cl.left,t);
        clone(arr,cl.right,t);
    }
}