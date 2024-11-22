class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
       
       if(head==null)return new Node(x);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(x);
        return head;
    }
}
