class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        for(int i=0;i<p && temp.next!=null;i++)
        {
            temp=temp.next;
        }
        Node newnode=new Node(x);
        newnode.next=temp.next;
        temp.next=newnode;
       newnode.prev=temp;
        
        return head;
    }
}
