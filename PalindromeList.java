//  Palindrome Linked List
// Given the head of a singly linked list, return true if it is a palindrome
//  or false otherwise.
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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        return true;
        ListNode start=head;
        ListNode middle=findMiddle(head);
        ListNode end=reverse(middle.next);
        while(end!=null)
        {
            if(start.val!=end.val)
            {
                return false;
            }
            start=start.next;
            end=end.next;
        }
        return true;
    }
    static ListNode findMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static ListNode reverse(ListNode head)
    {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}
