/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode head2=head.next;
        ListNode temp2 = head2;
        
        if(temp.next!=null && temp2.next!=null)
        {
            while(temp.next!=null && temp2.next!=null)
            {
                temp.next=temp.next.next;
                temp2.next=temp2.next.next;
                temp=temp.next;
                temp2=temp2.next;
                if(temp.next!=null)
                {
                    if(temp.next.next==null)
                    {
                        temp.next=null;
                    }
                }
                if(temp==null || temp2==null)
                {
                    break;
                }
            }
            
        }
        ListNode ptr = head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        if(ptr!=head2)
            ptr.next=head2;
        
        return head;
        
    }
}