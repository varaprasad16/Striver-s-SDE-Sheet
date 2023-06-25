//  Remove Nth Node From End of List
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        int pos=size-n;
        if(pos==0)
        return head=head.next;

        ListNode prev=head;
        for(int i=0;i<pos-1;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
        }
}
