class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
        for(int i=1;i<x && temp.next!=null;i++)
        {
            temp=temp.next;
        }
        if(x==1)
        {
            head=temp.next;
        }
        if(temp.prev!=null)
        {
            temp.prev.next=temp.next;
        }
        if(temp.next!=null)
        {
          temp.next.prev=temp.prev;
        }
       
        return head;
    }
}
