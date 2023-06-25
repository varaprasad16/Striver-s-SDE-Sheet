// Merge Two Sorted Lists
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.
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
    public ListNode mergeTwoLists(ListNode  A, ListNode B) {
          ListNode list=null;
          if(A==null)
          return B;
          if(B==null)
          return A;
          if(A.val<B.val)
          {
            list=A;
            list.next=mergeTwoLists(A.next,B);
          }
          else
          {
            list=B;
            list.next=mergeTwoLists(A,B.next);
          }
          return list;
    }
}
