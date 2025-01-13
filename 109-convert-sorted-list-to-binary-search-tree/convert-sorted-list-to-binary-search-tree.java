/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        return convertToBST(list);
    }
     public TreeNode convertToBST(ArrayList<Integer> list ) {
        int st = 0;
        int end = list.size()- 1;

        return createBST(list,st,end);
    }
    public TreeNode createBST(ArrayList<Integer> list ,int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list,st,mid-1);
        root.right = createBST(list,mid+1,end);

        return root;
    }
}