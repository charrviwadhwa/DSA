class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        List<Integer>l=new ArrayList();
        while(head1!=null){
            l.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            l.add(head2.data);
            head2=head2.next;
        }
        Collections.sort(l);
        Node temp =new Node(l.get(0));
        Node head=temp;
        for(int i=1;i<l.size();i++){
            Node temp1=new Node(l.get(i));
            temp.next=temp1;
            temp=temp.next;
        }
        return head;
    }
}
