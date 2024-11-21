class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null || head.next==null)
        {
            return head;
        }
        DLLNode curr=head;
        DLLNode prev =null;
        while(curr!=null)
        {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        
        
        return prev.prev ;
    }
}
