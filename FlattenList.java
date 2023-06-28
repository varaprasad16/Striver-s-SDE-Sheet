Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order. 
/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
public class FlattenList
{
    Node flatten(Node root)
    {
        if(root==null || root.next==null)
            return root;
        root.next=flatten(root.next);
        root=MergeSort(root,root.next);
        return root;
    }
    static Node MergeSort(Node A,Node B)
    {
        Node dummy=new Node(0);
        Node temp=dummy;
        if(A==null)
        return B;
        if(B==null)
        return A;
        while(A!=null && B!=null)
        {
            if(A.data<B.data)
            {
                temp.bottom=A;
                A=A.bottom;
            }
            else
            {
                temp.bottom=B;
                B=B.bottom;
            }
            temp=temp.bottom;
        }
        if(A==null)
        {
            temp.bottom=B;
        }
        if(B==null)
        {
            temp.bottom=A;
        }
        return dummy.bottom;
    }
}
