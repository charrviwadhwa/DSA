
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node fast=head;
        Node slow=head;
        
        while(fast!=null && fast.next!=null )
        {
            
            fast=fast.next.next;
            slow=slow.next; 
            int len=1;

            if(slow==fast)
            {
                slow=slow.next;
                while(slow!=fast)
                {
                    len++;
                    slow=slow.next;
                    
                }
                return len;
            }
        }
        return 0;
    }
}
