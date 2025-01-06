class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        List<Integer>l=new ArrayList();
        Node temp=head;
        while(temp!=null){
            l.add(temp.data);
           
            temp=temp.next;
        }
        Collections.sort(l);
        
        Node temp1=head;
        int i=0;
        while(temp1!=null  && i<l.size()){
            temp1.data=l.get(i);
            
            i++;
            temp1=temp1.next;
        }
        return head;
    }
}
