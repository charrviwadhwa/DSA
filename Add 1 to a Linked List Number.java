class Solution {
    public Node reverse (Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public Node addOne(Node head) {
        // code here.
        
        head=reverse(head);
        Node temp=head;
        int carry=1;
        while(temp!=null)
        {
            temp.data+=carry;
            if(temp.data<10)
            {
               carry=0;
               break;
            }
             else
             {
                temp.data=0;
                carry=1;
             }
            
           temp=temp.next;
            
        }
        if(carry==1)
        {
            Node newnode=new Node(1);
            head=reverse(head);
           newnode.next=head;
           return newnode;
            
        }
        
       head=reverse(head);
        return head;
       
    }
}
