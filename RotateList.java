// Rotate List
// Given the head of a linked list, rotate the list to the right by k places.
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null ||k==0)
        return head;
        ListNode cur=head;
        int cnt=1;
        while(cur.next!=null)
        {
            cnt++;
            cur=cur.next;
        }
        cur.next=head;
        k=k%cnt;
        int len=cnt-k;
        while(len-->0)
        {
            cur=cur.next;
        }
        head=cur.next;
        cur.next=null;
        return head;
    }
}
