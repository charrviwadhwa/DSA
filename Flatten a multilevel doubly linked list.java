class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node next= curr.next;
                Node child=flatten(curr.child);
                curr.next=child;
                child.prev=curr;
                curr.child = null; //remove the child node to prevent revoisiting while finding the tail

                Node temp=child;
                while(temp.next!=null){
                    temp=temp.next;
                }
               temp.next=next;
               if(next!=null){
                next.prev=temp;
               }
            }
            curr=curr.next;
        }
        return head;
    }
