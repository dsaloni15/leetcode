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
    public static void getInorder(TreeNode root,ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.val);
        getInorder(root.right,inorder);
    }
    public static TreeNode createBST(ArrayList<Integer> arr,int s, int e){
        if(s > e){
            return null;
        }

        int mid = (s+e)/2;
        TreeNode root = new TreeNode (arr.get(mid));
        root.left = createBST(arr,s,mid-1);
        root.right = createBST(arr,mid+1,e);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root,list);

        return createBST(list,0,list.size()-1);
    }
}