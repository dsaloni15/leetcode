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
class Solution {
    public static ListNode head;
    public static ListNode tail;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        
        
        int i = 1;
        int iToFind = sz - n;
        ListNode prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        if(n == sz){
            head = head.next;
        }
        
        else{
            prev.next = prev.next.next;
        }
        return head;
    }
}