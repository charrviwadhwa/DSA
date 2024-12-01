/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

         ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;// 2 ka jump
            slow=slow.next; // 1 ka jump

            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}
