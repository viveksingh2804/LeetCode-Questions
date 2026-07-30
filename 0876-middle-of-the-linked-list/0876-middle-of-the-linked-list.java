/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        List<Integer> list=new LinkedList<>();
    //    ListNode dummy = new ListNode(0);
    //     dummy.next = head;
        
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode mid=slow;
        ListNode dummy = new ListNode(0);
        dummy.next = slow;
        // while(mid.next!=null)
        // {
        //     list.add(mid);
        // }
        // ListNode dummy =new LinkedList(0);
        // ListNode curr=dummy;
        // for(int i=0;i<list.size();i++)
        // {
        //     curr.next=list.get(i);
        // }
        return dummy.next;
    }
}