/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A=headA;
        ListNode B=headB;
        if(A==null||B==null)
        return null;

        //Better Approach
        // Stack<ListNode> stk=new Stack<>();
        // while(A!=null)
        // {
        //     stk.add(A);
        //     A=A.next;
        // }
        // while(B!=null)
        // {
        //     if(stk.contains(B))
        //     return B;
        // }
        // return null;
        
        //Optimal
        // int length1=0;
        // int length2=0;
        // while(A!=null)
        // {
        //     A=A.next;
        //     length1++;
        // }
        // while(B!=null)
        // {
        //     B=B.next;
        //     length2++;
        // }
        // int diff=Math.abs(length1-length2);
        // A=headA;
        // B=headB;
        // for(int i=0;i<diff;i++)
        // {
        //     if(length1>length2)
        //     {
        //         A=A.next;
        //     }
        //     else if(length1<length2)
        //     {
        //         B=B.next;
        //     }    
        // }
        // while(A!=B)
        // {
        //     A=A.next;
        //     B=B.next;
        // }
        // return A;
        //Optimal 2
        while(A!=B)
        {
            if(A==null)
            A=headB;
            else
            A=A.next;
            if(B==null)
            B=headA;
            else
            B=B.next;
        }
        return A;
    }
}
