// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode Sum=new ListNode(0),st=Sum;
        int carry=0;
        while(cur1!=null || cur2!=null || carry==1)
        {
            int sum=0;
            if(cur1!=null)
            {
                sum+=cur1.val;
                cur1=cur1.next;
            }
            if(cur2!=null)
            {
                sum+=cur2.val;
                cur2=cur2.next;
            }
            sum+=carry;
            int num=sum%10;
            carry=sum/10;
            ListNode New=new ListNode(num);
            st.next=New;
            st=st.next;
        }
        return Sum.next;
     }
    }
    
