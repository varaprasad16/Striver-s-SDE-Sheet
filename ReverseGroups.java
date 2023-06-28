Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k 
then left-out nodes, in the end, should remain as it is.
You may not alter the values in the list's nodes, only nodes themselves may be changed.
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
class ReverseGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
            ListNode cur=head;
            ListNode prev=null;
            ListNode temp=null;
            int length=0;
            while(cur!=null)
            {
                cur=cur.next;
                length++;
            }
            cur=head;
            while(cur!=null)
            {
                if(length>=k)
                for(int i=0;i<=k;i++)
                {
                    temp=cur.next;
                    cur.next=prev;
                    prev=cur;
                    cur=temp;
                }
                length=length-k;
            }
            head.next=cur;
            head=prev;
            return head;
    }
}
